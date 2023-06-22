package com.example.graphqldemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    data class Response(val message: String)
    @GetMapping("/")
    fun hello(): Response {
        return Response("Hello, world!")
    }
}
