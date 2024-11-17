package com.sergei.kotlincourse.lesson22.homework.extensions

//Определите функцию-расширение для класса длинного числа, допускающее null, которая не принимает аргументов и возвращает строку.

fun Long?.toCustomString(): String {
    return this.toString()
}

fun main() {
    val number: Long = 123456789L
    val nullNumber: Long? = null


    println(number.toCustomString())
    println(nullNumber.toCustomString())
}