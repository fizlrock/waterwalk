package com.example.waterwalk.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.waterwalk.domain.model.Location
import com.example.waterwalk.domain.usecase.GetLocationsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class Message(val id: Long, val message: String)

data class LocationUIState(
    val locations: List<Location> = emptyList(),
    val userMessages: List<Message> = listOf(),
    val isLoading: Boolean = false
)

@HiltViewModel
class LocationViewModel @Inject constructor(
    private val getLocationsUseCase: GetLocationsUseCase
) : ViewModel() {

    private val TAG = "LocationViewModel"

    // Общее состояние UI
    private val _uiState = MutableStateFlow(LocationUIState())
    val uiState: StateFlow<LocationUIState> = _uiState.asStateFlow()

    fun loadLocations() {
        viewModelScope.launch {
            try {
                Log.d(TAG, "Try loading locations...")
                _uiState.value = _uiState.value.copy(isLoading = true)
                getLocationsUseCase.execute(0, 10).collect { locationsList ->
                    Log.d(TAG, "Loaded ${locationsList.size} locations")
                    _uiState.value = _uiState.value.copy(locations = locationsList) // Обновляем список
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error loading locations: ${e.localizedMessage}")
                val errorMessage = "Ошибка: ${e.localizedMessage}"
                _uiState.value = _uiState.value.copy(userMessages = listOf(Message(System.currentTimeMillis(), errorMessage)))
            } finally {
                _uiState.value = _uiState.value.copy(isLoading = false)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "Shutting down gRPC channel")
    }
}