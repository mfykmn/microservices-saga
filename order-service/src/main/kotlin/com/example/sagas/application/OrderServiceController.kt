package com.example.sagas.application

import com.example.sagas.domain.entity.Order
import com.example.sagas.domain.entity.OrderDetails
import kotlin.random.Random
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity

import com.example.sagas.domain.service.OrderService

@RestController
@RequestMapping(path = ["orders"])
class OrderServiceController {

    @Autowired
    lateinit var service: OrderService

    @GetMapping(path = ["{order_id}"])
    fun getOrder(@PathVariable(value = "order_id") orderId: Long) : ResponseEntity<Order> {
        val order = Order(0, "test") // TODO: service実行 service.findById(orderId)
        return ResponseEntity.ok(order)
    }

    @PostMapping(path=["/orders"])
    fun createOrder() : ResponseEntity<String> {
        // TODO: リクエスト取得
        // TODO: バリデーション
        // TODO: リクエストボディをドメインモデルに落とし込み

        val orderDetails = OrderDetails(Random.nextInt(10), "test")
        service.createOrder(orderDetails)

        return ResponseEntity.ok("success")
    }
}
