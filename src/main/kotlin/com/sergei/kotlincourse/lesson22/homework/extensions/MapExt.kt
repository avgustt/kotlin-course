package com.sergei.kotlincourse.lesson22.homework.extensions

//Реализуйте функцию-расширение для класса словаря допускающего null с ключами дженериком и значениями
//типа список из такого же дженерика, которая принимает один аргумент типа число и возвращает словарь
//допускающий null с ключами типа строка и значениями типа дженерика допускающего null.

fun main() {

    fun <T> Map<T, List<T>>?.forMap(first: Number): Map<String, T?> {

        val result = mutableMapOf<String, T?>()

        this?.forEach { (key, value) ->
            result[key.toString()] = value.firstOrNull()
        }
        return result
    }

    val originalMap: Map<Int, List<Int>> = mapOf(1 to listOf(10, 20), 2 to listOf(30, 40))
    println(originalMap.forMap(1))

}