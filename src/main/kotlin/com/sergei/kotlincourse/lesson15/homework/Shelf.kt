package com.sergei.kotlincourse.lesson15.homework

class Shelf (internal val capacity: Int) {
private val items = mutableListOf<String>()

    fun addItem () {

    }

    fun removeItem () {

    }


    fun canAccommodate (name: String): Boolean {
     val currentLand = items.sumOf { it.length }
     return (currentLand + name.length <= capacity)
        }
}