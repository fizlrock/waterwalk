package com.example.waterwalk.presentation.screens

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.waterwalk.presentation.components.BottomNavigationBar
import com.example.waterwalk.presentation.navigation.BottomNavGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    DisposableEffect(Unit) {
        onDispose {
            Log.d("onDispose", "grpc channel shutdown")
            GrpcChannelProvider.shutdown() // Закрываем gRPC соединение
        }
    }

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            BottomNavGraph(navController)
        }
    }
}