package com.sergei.kotlincourse.lesson18.homework.animals

fun main () {
    val animals = listOf(Dog(), Cat(), Bird())
    animals.forEach { it.makeSound("") }
}