package com.example.sagas.domain.entity

import java.util.UUID

typealias OrderId = String

class Order(val orderId: OrderId, val itemId: Int, val itemName: String) {
    constructor(itemId: Int, itemName: String): this(UUID.randomUUID().toString(), itemId, itemName)
}
