package com.example.waterwalk.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.waterwalk.presentation.components.LocationCard
import com.example.waterwalk.presentation.viewmodel.LocationViewModel
import kotlinx.coroutines.launch

@Composable
fun LocationListScreen(viewModel: LocationViewModel = hiltViewModel()) {
    val uiState by viewModel.uiState.collectAsState()

    // Snackbar host state для отображения Snackbar
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    LaunchedEffect(uiState.userMessages) {
        // Если есть новые сообщения, показываем Snackbar
        uiState.userMessages.forEach { message ->
            scope.launch {
                snackbarHostState.showSnackbar(
                    message = message.message, // Сообщение из userMessages
                    duration = SnackbarDuration.Short
                )
            }
        }
    }

    LaunchedEffect(Unit) {
        viewModel.loadLocations() // Убедись, что тут вызывается правильная асинхронная функция
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) }, // Добавляем SnackbarHost
    ) {
        if (uiState.isLoading) {
            CircularProgressIndicator()
        }
        Column(modifier = Modifier.fillMaxSize().padding(it)) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ExtendedFloatingActionButton(
                        onClick = { /* Handle "New Location" click */ },
                        icon = { Icon(imageVector = Icons.Default.Add, contentDescription = "Add New Location") },
                        text = { Text(text = "Новая локация") },
                        modifier = Modifier.weight(1f)
                    )

                    ExtendedFloatingActionButton(
                        onClick = { /* Handle "New Route" click */ },
                        icon = { Icon(imageVector = Icons.Default.Add, contentDescription = "Add New Route") },
                        text = { Text(text = "Новый маршрут") },
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            // Display locations
            LazyColumn {
                items(uiState.locations) { location ->
                    LocationCard(location)
                }
            }
        }
        }
}
