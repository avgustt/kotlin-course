package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson26

class OrderProcessor(val deliveryAddress: String) {

    fun calculateDeliveryTime(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
}

val calculateDeliveryTime: OrderProcessor.(Int) -> String = {
    val deliveryTimeDays = when (it) {
        in 1..100 -> 3
        else -> 5
    }
    "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}

