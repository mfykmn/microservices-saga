package com.example.sagas.infrastructure

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection="orders")
data class Order(
    @Field("item_id")
    var itemId: Int,

    @Field("item_name")
    var itemName: String,
)
