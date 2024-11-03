package com.sergei.kotlincourse.lesson18.homework.shopping

class SingleItemCart : ShoppingCart() {
    override fun addToCart(itemId: String) {
        cart[itemId] = cart.getOrDefault(itemId, 0) + 1
    }
}