package com.sergei.kotlincourse.lesson15

fun main() {
    val result = Calculator.add(5, 3)
    println("Result: $result")


    data class User(val id: Int, val name: String)

    var lamp1 = Lamp(isOn = true)
    lamp1.switch()

}