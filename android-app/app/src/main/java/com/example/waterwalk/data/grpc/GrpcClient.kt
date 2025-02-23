package com.example.waterwalk.data.grpc

import dev.fizlrock.waterwalk.grpc.api.WaterwalkServiceGrpc
import dev.fizlrock.waterwalk.grpc.api.WaterwalkServiceGrpc.WaterwalkServiceBlockingStub
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder

object GrpcClient {
    private const val SERVER_ADDRESS = "10.0.2.2:9090"

    val channel: ManagedChannel = ManagedChannelBuilder
        .forTarget(SERVER_ADDRESS)
        .usePlaintext()
        .build()

    fun newStub(): WaterwalkServiceGrpc.WaterwalkServiceStub {
        return WaterwalkServiceGrpc.newStub(channel)
    }

    fun newBlockingStub(): WaterwalkServiceBlockingStub {
        return WaterwalkServiceGrpc.newBlockingStub(channel)
    }
}