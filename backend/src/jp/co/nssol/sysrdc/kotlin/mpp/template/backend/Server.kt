package jp.co.nssol.sysrdc.kotlin.mpp.template.backend

import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.*
import io.ktor.gson.GsonConverter
import io.ktor.http.ContentType
import io.ktor.response.respond
import io.ktor.routing.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import jp.co.nssol.sysrdc.kotlin.mpp.template.common.model.Data
import org.slf4j.event.Level


fun main(args: Array<String>) {
    embeddedServer(Netty, 10000) {

        // Serialize json
        install(ContentNegotiation) {
            register(ContentType("[*", "*]"), GsonConverter())
            register(ContentType("*", "*"), GsonConverter())
            register(ContentType.Application.Json, GsonConverter())
            register(ContentType.Text.Html, GsonConverter())
            register(ContentType.Text.Plain, GsonConverter())

        }

        // Return custom errors (if needed)
        install(StatusPages)

        // CORS有効
        install(CORS) { anyHost() }

        install(DefaultHeaders)
        install(ConditionalHeaders)

        // Loggin機能install
        install(CallLogging) {
            level = Level.TRACE
        }

        // Routing
        install(Routing) {
            route("/crud") {
                get { call.respond(Data("test", 1234)) }
                put { call.respond("Put Hello") }
                post { call.respond("Post Hello") }
                delete { call.respond("Delete Hello") }
            }
        }


    }.start(wait = true)
}

class Test(val name: String) {
}