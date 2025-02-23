package com.example.waterwalk.domain.usecase

import com.example.waterwalk.data.grpc.WaterWalkRepositoryImpl
import com.example.waterwalk.domain.model.Location
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetLocationsUseCase @Inject constructor(
    private val repository: WaterWalkRepositoryImpl
) {
    fun execute(skip: Long, limit: Long): Flow<List<Location>> {
        return repository.getLocations(skip, limit)
    }
}