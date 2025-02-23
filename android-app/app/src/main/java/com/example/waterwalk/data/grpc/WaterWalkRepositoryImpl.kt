package com.example.waterwalk.data.grpc

import android.util.Log
import com.example.waterwalk.data.repository.WaterWalkRepository
import com.example.waterwalk.domain.model.Location
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WaterWalkRepositoryImpl @Inject constructor(
    private val waterWalkGrpcService: WaterWalkGrpcService) : WaterWalkRepository {

    private val TAG = "WaterWalkRepositoryImpl"

    override fun getLocations(skip: Long, limit: Long): Flow<List<Location>> {
        Log.d(TAG, "Request to get locations with skip: $skip, limit: $limit")
        return flow {
            try {
                val locations = mutableListOf<Location>()
                waterWalkGrpcService.getLocationList(skip, limit).collect { grpcLocation ->
                    locations.add(Location(name = grpcLocation.name, description = grpcLocation.description))
                }
                Log.d(TAG, "Received ${locations.size} locations")
                emit(locations)
            } catch (e: Exception) {
                Log.e(TAG, "Error while fetching locations", e)
                throw e // Re-throw the exception for upstream handling
            }
        }
    }

    override suspend fun createLocation(location: dev.fizlrock.waterwalk.grpc.api.Location): Result<Unit> {
        return waterWalkGrpcService.createLocation(location)
    }

    override suspend fun deleteLocation(locationName: String): Result<Unit> {
        return waterWalkGrpcService.deleteLocation(locationName)
    }

    override suspend fun updateLocation(oldName: String, newLocation: dev.fizlrock.waterwalk.grpc.api.Location): Result<Unit> {
        return waterWalkGrpcService.updateLocation(oldName, newLocation)
    }
}