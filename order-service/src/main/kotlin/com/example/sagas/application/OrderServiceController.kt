package com.example.sagas.application

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@RestController
@RequestMapping()
class OrderServiceController {
    @GetMapping("/")
    fun createOrder() : String {
        return "Hello World!"
    }
}
