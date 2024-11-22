package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson23.homeWork


//for (item in mixedList) {
//        when (item) {
//            is String -> println("$item - строка длиной ${item.length}")
//            is Int -> println("$item - целое число")
//            is Double -> println("$item - вещественное число")
//            else -> println("Неизвестный тип")

//Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна определить тип аргумента и вывести соответствующее сообщение:
//Для строки: "Это строка: [значение]".
//Для целого числа: "Это целое число: [значение]".
//Для списка: "Это список, количество элементов: [количество]".
//Для карты: "Это карта, количество пар: [количество]".
//Для остальных типов: "Неизвестный тип данных".
//Используйте оператор is для проверки типов.

fun main() {
    fun analyzeDataType (i: Any) {
        when (i) {
            is String -> println("Это строка: $i")
            is Int -> println("Это целое число: $i")
            is List<*> -> println("Это список, количество элементов:${i.size}")
            is Map<*,*> -> println("Это карта, количество пар: ${i.size}")
            else -> println("Неизвестный тип данных")

        }
    }

    val va = listOf<Any>()
    analyzeDataType(va)
}