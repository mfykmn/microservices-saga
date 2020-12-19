package com.examples.sagas.application

import org.springframework.boot.autoconfigure.*
import org.springframework.web.bind.annotation.*

@RestController
@EnableAutoConfiguration
class OrderServiceController {
    @RequestMapping("/")
    fun home() : String {
        return "Hello World!"
    }
}
