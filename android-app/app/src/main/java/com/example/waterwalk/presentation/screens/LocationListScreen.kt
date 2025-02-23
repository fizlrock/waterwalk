package com.example.waterwalk.presentation.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.waterwalk.presentation.components.LocationCard
import com.example.waterwalk.presentation.viewmodel.LocationViewModel
import kotlinx.coroutines.launch

@Composable
fun LocationListScreen(viewModel: LocationViewModel = hiltViewModel()) {
    val locations by viewModel.locations.collectAsState()
    val errorMessage by viewModel.errorMessage.collectAsState() // Подписываемся на ошибки
    val isLoading by viewModel.isLoading.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadLocations() // Убедись, что тут вызывается правильная асинхронная функция
    }

    if (isLoading) {
        CircularProgressIndicator()
    }

    Column(modifier = Modifier.fillMaxSize()) {
        // Показываем ошибку, если есть
        errorMessage?.let { error ->
            Text(
                text = error,
                color = Color.Red,
                modifier = Modifier.padding(16.dp)
            )
        }
        LazyColumn {
            items(locations) { location ->
                LocationCard(location)
            }
        }
    }
}
