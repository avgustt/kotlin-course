package com.sergei.kotlincourse.lesson18.homework.shopping

class ListItemCart : ShoppingCart() {
    fun addToCart(itemIds: List<String>) {
        for (itemId in itemIds) {
            cart[itemId] = cart.getOrDefault(itemId, 0) + 1
        }
    }

    override fun addToCart(itemId: String) {
        addToCart(listOf(itemId))
    }
}