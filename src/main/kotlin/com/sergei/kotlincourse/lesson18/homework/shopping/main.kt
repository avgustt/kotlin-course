package com.sergei.kotlincourse.lesson18.homework.shopping

fun main() {

        // добавления одного товара по его ID
        val singleItemCart = SingleItemCart()
        singleItemCart.addToCart("A101")
        println(singleItemCart)

        // добавления товара с количеством
        val multiItemCart = MultiItemCart()
        multiItemCart.addToCart("B202", 5)
        println(multiItemCart)

        // добавления товаров парами
        val bulkItemCart = BulkItemCart()
        val items = mapOf("C303" to 3, "D404" to 2)
        bulkItemCart.addToCart(items)
        println(bulkItemCart)

        // для добавления товаров по списку
        val listItemCart = ListItemCart()
        val itemList = listOf("A101", "B202", "E505")
        listItemCart.addToCart(itemList)
        println(listItemCart)
    }
