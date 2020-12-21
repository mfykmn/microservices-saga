package com.example.sagas.domain.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

import com.example.sagas.infrastructure.Order // TODO: 依存性が逆では？

@Repository
interface OrderRepository : MongoRepository<Order?, Long?> {
    fun save(order: Order?)
}
