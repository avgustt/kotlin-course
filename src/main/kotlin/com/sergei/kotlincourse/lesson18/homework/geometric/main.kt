package com.sergei.kotlincourse.lesson18.homework.geometric

fun main() {
val shapes = listOf(
    Circle(2.0),
    Square(5.0),
    Triangle(4.0, 5.0, 70.0)
)
    shapes.forEach { it ->
        println(it.area())
    }

}