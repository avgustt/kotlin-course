package com.sergei.kotlincourse.lesson22.homework.extensions

fun main() {

//Создайте функцию-расширение для класса изменяемого списка элементов с дженериком, которая принимает два аргумента:
//один типа дженерик, допускающий null, и другой типа число, и возвращает значение типа дженерик, допускающий null.

    fun <T> MutableList<T>.twoArguments(first: T?, second: Number): T? {

        return first
    }

    val list = mutableListOf(1, 2, 3)
    println(list.twoArguments(42, 10))

}