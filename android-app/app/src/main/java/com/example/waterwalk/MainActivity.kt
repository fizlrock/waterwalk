package com.example.waterwalk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.waterwalk.presentation.screens.LocationListScreen
import com.example.waterwalk.presentation.screens.MainScreen
import dagger.hilt.android.AndroidEntryPoint
import dev.fizlrock.waterwalk.grpc.api.Location
import dev.fizlrock.waterwalk.grpc.api.SkipLimit
import dev.fizlrock.waterwalk.grpc.api.WaterwalkServiceGrpc
import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

//class MainActivity : ComponentActivity() {
//    private val serverAddress = "10.0.2.2:9090"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MaterialTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    LocationListScreen()
//                }
//            }
//        }
//    }
//    @Composable
//    fun LocationListScreen() {
//        var locations by remember { mutableStateOf(listOf<Location>()) }
//        val coroutineScope = rememberCoroutineScope()
//
//        LaunchedEffect(Unit) {
//            // Запрос в фоновом потоке
//            coroutineScope.launch {
//                val channel = ManagedChannelBuilder.forTarget(serverAddress).usePlaintext().build()
//                val stub = WaterwalkServiceGrpc.newStub(channel)
//
//                val request = SkipLimit.newBuilder().setSkip(0).setLimit(10).build()
//
//                // Весь код здесь - это работа с асинхронным gRPC запросом
//                val responseObserver = object : io.grpc.stub.StreamObserver<Location> {
//                    override fun onNext(value: Location) {
//                        // Эмитим в поток
//                        locations = locations + value
//                    }
//
//                    override fun onError(t: Throwable) {
//                        // Обработка ошибки
//                        println("Error: ${t.message}")
//                    }
//
//                    override fun onCompleted() {
//                        // Завершение потока
//                        channel.shutdown()
//                    }
//                }
//
//                // Запуск запроса
//                stub.getLocationList(request, responseObserver)
//            }
//        }
//
//        Column {
//            locations.forEach { location ->
//                BasicText(text = "${location.name}: ${location.description}")
//            }
//        }
//    }
//
//    @Preview(showBackground = true)
//    @Composable
//    fun DefaultPreview() {
//        LocationListScreen()
//    }
//}
