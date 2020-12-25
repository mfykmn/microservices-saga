package com.example.sagas.presentation

import com.example.sagas.domain.entity.Order
import com.example.sagas.domain.entity.OrderDetails
import kotlin.random.Random
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import com.example.sagas.application.OrderService
import com.example.sagas.domain.entity.OrderId

@RestController
@RequestMapping(path = ["orders"])
class OrderServiceController {

    @Autowired
    lateinit var service: OrderService

    @GetMapping(path = ["{order_id}"])
    fun getOrder(@PathVariable("order_id") orderId: OrderId) : ResponseEntity<Order> {
        val order = service.findById(orderId)
        if (order != null) {
            return ResponseEntity.ok(order)
        }
        return ResponseEntity.notFound().build()
    }

    @PostMapping()
    fun createOrder() : ResponseEntity<String> {
        // TODO: リクエスト取得
        // TODO: バリデーション
        // TODO: リクエストボディをドメインモデルに落とし込み

        val orderDetails = OrderDetails(Random.nextInt(10), "test")
        service.createOrder(orderDetails)

        return ResponseEntity.ok("success")
    }
}
