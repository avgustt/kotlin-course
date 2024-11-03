package com.sergei.kotlincourse.lesson18.homework.shopping

class MultiItemCart : ShoppingCart() {
    fun addToCart(itemId: String, amount: Int) {
        cart[itemId] = cart.getOrDefault(itemId, 0) + amount
    }


    override fun addToCart(itemId: String) {
        addToCart(itemId, 1)
    }
}