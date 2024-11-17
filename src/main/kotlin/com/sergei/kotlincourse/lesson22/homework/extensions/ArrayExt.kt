package com.sergei.kotlincourse.lesson22.homework.extensions

fun main() {

//Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел.

    fun <T : Number> Array<T>.setPair(): Pair<T, T>? {
        return if (this.size >= 2) {
            this[0] to this[1]
        } else return null
    }

    val array = arrayOf(1, 2, 3)
    println(array.setPair())

}