package com.example.waterwalk.data.repository

import com.example.waterwalk.domain.model.Location
import kotlinx.coroutines.flow.Flow

interface WaterWalkRepository {
    fun getLocations(skip: Long, limit: Long): Flow<List<Location>>
    suspend fun createLocation(location: dev.fizlrock.waterwalk.grpc.api.Location): Result<Unit>
    suspend fun deleteLocation(locationName: String): Result<Unit>
    suspend fun updateLocation(oldName: String, newLocation: dev.fizlrock.waterwalk.grpc.api.Location): Result<Unit>
}