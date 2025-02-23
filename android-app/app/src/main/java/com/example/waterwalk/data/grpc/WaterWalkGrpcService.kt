package com.example.waterwalk.data.grpc

import GrpcChannelProvider
import android.util.Log
import dev.fizlrock.waterwalk.grpc.api.*
import io.grpc.Status
import io.grpc.StatusRuntimeException
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import java.util.concurrent.TimeUnit

class WaterWalkGrpcService {
    private val TAG = "WaterWalkGrpcService"

    fun getLocationList(skip: Long, limit: Long): Flow<Location> = callbackFlow {
        try {
            Log.d(TAG, "Sending request to get locations with skip: $skip, limit: $limit")
            val request = SkipLimit.newBuilder().setSkip(skip).setLimit(limit).build()

            // Создаём новый stub с новым deadline при каждом вызове!
            val stubWithTimeout = GrpcChannelProvider.newStub().withDeadlineAfter(5, TimeUnit.SECONDS)

            val responseObserver = object : io.grpc.stub.StreamObserver<Location> {
                override fun onNext(value: Location) {
                    Log.d(TAG, "Received location: ${value.name}")
                    trySend(value).isSuccess
                }

                override fun onError(t: Throwable) {
                    Log.e(TAG, "gRPC error: ${t.localizedMessage}")
                    if (t is StatusRuntimeException) {
                        when (t.status.code) {
                            Status.Code.DEADLINE_EXCEEDED, Status.Code.UNAVAILABLE -> {
                                Log.e(TAG, "Closing gRPC channel due to connection issues")
                                GrpcChannelProvider.shutdown()  // Закрываем канал вручную
                            }

                            else -> {
                                Log.e(TAG, "Other gRPC error: ${t.status.code}")
                            }
                        }
                    }
                    channel.close(t)
                }

                override fun onCompleted() {
                    Log.d(TAG, "gRPC call completed")
                    channel.close()
                }
            }

            stubWithTimeout.getLocationList(request, responseObserver)

        } catch (e: Exception) {
            Log.e(TAG, "Error in getLocations", e)
        }
        awaitClose {
            Log.d(TAG, "gRPC call ended")
        }
    }

    suspend fun createLocation(location: Location): Result<Unit> {
        Log.d(TAG, "Send request to create location: ${location.name}")
        return try {
            val stub = GrpcChannelProvider.newBlockingStub()
            stub.createLocation(location)
            Log.d(TAG, "Location created: ${location.name}")
            Result.success(Unit) // Успешный результат
        } catch (e: Exception) {
            Log.e(TAG, "Error creating location", e)
            Result.failure(e) // Ошибка
        }
    }

    suspend fun deleteLocation(locationName: String): Result<Unit> {
        Log.d(TAG, "Send request to delete location: $locationName")
        return try {
            val stub = GrpcChannelProvider.newBlockingStub()
            val request = DeleteLocationRq.newBuilder()
                .setLocationName(locationName)
                .build()
            stub.deleteLocation(request)
            Log.d(TAG, "Location deleted: $locationName")
            Result.success(Unit)
        } catch (e: Exception) {
            Log.e(TAG, "Error deleting location", e)
            Result.failure(e) // Ошибка
        }
    }

    suspend fun updateLocation(oldName: String, newLocation: Location): Result<Unit> {
        Log.d(TAG, "Send request to update location: $oldName to ${newLocation.name}")
        return try {
            val stub = GrpcChannelProvider.newBlockingStub()
            val request = UpdateLocationRq.newBuilder()
                .setOldName(oldName)
                .setLocation(newLocation)
                .build()
            stub.updateLocation(request)
            Log.d(TAG, "Location updated from $oldName to ${newLocation.name}")
            Result.success(Unit)
        } catch (e: Exception) {
            Log.e(TAG, "Error updating location", e)
            Result.failure(e) // Ошибка
        }
    }

}