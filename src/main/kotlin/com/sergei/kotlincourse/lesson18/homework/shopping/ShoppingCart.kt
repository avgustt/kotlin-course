package com.sergei.kotlincourse.lesson18.homework.shopping

abstract class ShoppingCart {

    protected val cart = mutableMapOf<String, Int>()

    // Конкретный метод для добавления одной единицы товара по ID
    open fun addToCart(itemId: String) {
        cart[itemId] = cart.getOrDefault(itemId, 0) + 1
    }

    override fun toString(): String {
        val cartDetails = StringBuilder("Shopping Cart Contents:\n")
        var totalUniqueItems = 0
        var totalQuantity = 0

        for ((itemId, quantity) in cart) {
            cartDetails.append("Item ID: $itemId, Quantity: $quantity\n")
            totalUniqueItems++
            totalQuantity += quantity
        }

        cartDetails.append("Total unique items: $totalUniqueItems\n")
        cartDetails.append("Total quantity of items: $totalQuantity\n")

        return cartDetails.toString()
    }
}