package com.sergei.kotlincourse.lesson25.homework

//Задание 5. Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.


fun main() {
    val list = listOf<Int>(1, 2, 7, 9, 8, 2, 4, 4, 9, 9)

    println(forFive(list))
}

fun forFive(list: List<Int>): List<Int> {
    require(list.isNotEmpty()) {"Список не должен быть пустым"}
    return list.toSet().toList()
}