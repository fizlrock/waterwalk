package com.example.waterwalk.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.waterwalk.data.grpc.GrpcClient
import com.example.waterwalk.domain.model.Location
import com.example.waterwalk.domain.usecase.GetLocationsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@HiltViewModel
class LocationViewModel @Inject constructor(
    private val getLocationsUseCase: GetLocationsUseCase
) : ViewModel() {

    private val TAG = "LocationViewModel"
    private val _locations = MutableStateFlow<List<Location>>(emptyList())
    val locations: StateFlow<List<Location>> = _locations.asStateFlow()

    private val _errorMessage = MutableStateFlow<String?>(null) // Для ошибок
    val errorMessage: StateFlow<String?> = _errorMessage.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()
//    init {
//        Log.d(TAG, "ViewModel initialized, loading locations")
//        loadLocations()
//    }

    fun loadLocations() {
        viewModelScope.launch {
            try {
                Log.d(TAG, "Loading locations...")
                _isLoading.value = true  // Начинаем загрузку
                _errorMessage.value = null // Сбрасываем ошибку перед загрузкой
                getLocationsUseCase.execute(0, 10).collect { locationsList ->
                    Log.d(TAG, "Loaded ${locationsList.size} locations")
                    _locations.value = locationsList
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error while loading locations", e)
                _errorMessage.value = "Ошибка загрузки данных: ${e.localizedMessage}" // Записываем ошибку
            } finally {
                _isLoading.value = false  // Загрузка завершена
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "Shutting down gRPC channel")
        GrpcClient.channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
    }
}