package com.example.sagas.application

import kotlin.random.Random
import com.example.sagas.domain.entity.OrderDetails
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.beans.factory.annotation.Autowired

import com.example.sagas.domain.service.OrderService

@RestController
@RequestMapping()
class OrderServiceController {

    @Autowired
    lateinit var orderService: OrderService

    @GetMapping("/")
    fun createOrder() : String {
        // TODO: リクエスト取得
        // TODO: バリデーション
        // TODO: リクエストボディをドメインモデルに落とし込み

        val orderDetails = OrderDetails(Random.nextInt(10), "test")
        val order = orderService.createOrder(orderDetails)

        // TODO: レスポンス組み立て

        return order.itemName
    }
}
