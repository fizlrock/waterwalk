package com.example.waterwalk.di

import com.example.waterwalk.data.grpc.WaterWalkGrpcService
import com.example.waterwalk.data.grpc.WaterWalkRepositoryImpl
import com.example.waterwalk.data.repository.WaterWalkRepository
import com.example.waterwalk.domain.usecase.GetLocationsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideWaterWalkGrpcService() = WaterWalkGrpcService()

    @Provides
    @Singleton
    fun provideWaterWalkRepository(service: WaterWalkGrpcService): WaterWalkRepository =
        WaterWalkRepositoryImpl(service)

    @Provides
    @Singleton
    fun provideGetLocationsUseCase(repository: WaterWalkRepositoryImpl) =
        GetLocationsUseCase(repository)
}