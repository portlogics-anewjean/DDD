package com.ecommerce.ddd.order.domain

import jakarta.persistence.Embeddable
import java.util.UUID

@Embeddable
data class OrderNo(
    val value: String
) {
    init {
        require(value.isNotBlank()) {"order no can't be blank"}
    }

    companion object {
        fun generate(): OrderNo = OrderNo(UUID.randomUUID().toString())
    }

    override fun toString(): String = value
}