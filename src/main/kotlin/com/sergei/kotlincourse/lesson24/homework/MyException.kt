package com.sergei.kotlincourse.lesson24.homework

class MyException(cause: ArrayIndexOutOfBoundsException): RuntimeException(cause)

fun main() {
    try {
        val array = arrayOf(1, 2, 3)
        println(array[5])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Перехвачено ArrayIndexOutOfBoundsException: ${e.message}")
        throw MyException(e)
    }
}