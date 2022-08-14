package com.uxstate

import io.ktor.server.application.*
import com.uxstate.plugins.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

 // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
     routing {
         get("/") {
             call.respondText("Hello World!")
         }

         get("/welcome") {
             call.respondText("Hello Sir")
         }

         get("/tonnie") {
             call.respondText("Hello Tonnie")
         }

         get("/muchiri") {
             call.respondText("Hello T-Muchiri")
         }
         get("/mu") {
             call.respondText("Hello Muraguri")
         }
     }
}
