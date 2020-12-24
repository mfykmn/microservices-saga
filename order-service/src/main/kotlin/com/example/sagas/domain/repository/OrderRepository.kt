package com.example.sagas.domain.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

import com.example.sagas.domain.entity.Order

@Repository
interface OrderRepository : MongoRepository<Order, Long?> {
    fun save(order: Order) {
        DbOrder(itemId = order.itemId, itemName = order.itemName)
    }
}
