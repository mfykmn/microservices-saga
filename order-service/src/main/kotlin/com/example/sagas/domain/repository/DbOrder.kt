package com.example.sagas.domain.repository

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection="orders")
data class DbOrder(
    @Field("item_id")
    var itemId: Int,

    @Field("item_name")
    var itemName: String,
)
