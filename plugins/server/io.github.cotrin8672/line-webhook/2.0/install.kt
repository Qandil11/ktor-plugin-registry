import io.ktor.server.application.*
import io.ktor.server.plugins.*
import io.github.cotrin8672.linewebhook.*

fun Application.module() {
    install(LineWebhook) {
        channelSecret = System.getenv("LINE_CHANNEL_SECRET") 
            ?: error("LINE_CHANNEL_SECRET not set")
    }
}
