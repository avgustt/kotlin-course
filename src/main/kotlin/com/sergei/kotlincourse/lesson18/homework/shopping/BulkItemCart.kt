package com.sergei.kotlincourse.lesson18.homework.shopping

class BulkItemCart : ShoppingCart() {
    fun addToCart(items: Map<String, Int>) {
        for ((itemId, quantity) in items) {
            cart[itemId] = cart.getOrDefault(itemId, 0) + quantity
        }
    }


    override fun addToCart(itemId: String) {
        addToCart(mapOf(itemId to 1))
    }
}