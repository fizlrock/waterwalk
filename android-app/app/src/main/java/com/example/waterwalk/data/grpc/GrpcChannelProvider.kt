import android.util.Log
import dev.fizlrock.waterwalk.grpc.api.WaterwalkServiceGrpc
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import java.util.concurrent.TimeUnit

object GrpcChannelProvider {
    private const val SERVER_ADDRESS = "10.0.2.2:9090"

    // Ссылка на ManagedChannel, которая может быть переинициализирована при необходимости.
    @Volatile
    private var channel: ManagedChannel? = null
    private val lock = Any()

    // Функция возвращает действующий канал, создавая его заново, если предыдущий завершён.
    private fun getChannel(): ManagedChannel {
        val currentChannel = channel
        if (currentChannel == null || currentChannel.isShutdown || currentChannel.isTerminated) {
            synchronized(lock) {
                if (channel == null || channel!!.isShutdown || channel!!.isTerminated) {
                    Log.d("grpcProvider", "Create grpc channel")
                    channel = ManagedChannelBuilder
                        .forTarget(SERVER_ADDRESS)
                        .usePlaintext()
                        .build()
                    // При необходимости можно настроить политики повторных попыток и прочее.
                }
            }
        }
        return channel!!
    }

    // Создаёт асинхронный stub, используя актуальный канал.
    fun newStub(): WaterwalkServiceGrpc.WaterwalkServiceStub {
        return WaterwalkServiceGrpc.newStub(getChannel())
    }

    // Создаёт блокирующий stub.
    fun newBlockingStub(): WaterwalkServiceGrpc.WaterwalkServiceBlockingStub {
        return WaterwalkServiceGrpc.newBlockingStub(getChannel())
    }

    // Метод для корректного завершения работы канала.
    fun shutdown() {
        synchronized(lock) {
            channel?.shutdown()?.awaitTermination(5, TimeUnit.SECONDS)
            channel = null
        }
    }
}
