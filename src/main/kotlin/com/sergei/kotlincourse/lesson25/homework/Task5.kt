package com.sergei.kotlincourse.lesson25.homework

import com.sergei.kotlincourse.lesson13.list


//Задание 5. Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.


fun main() {
    val list0 = listOf<Int>(1, 2, 7, 9, 8, 2, 4, 4, 9, 9)

    val list1 = listOf<Int>()

    println(forFive3(list0))//проверка, что лямбда выражение работает правильно
    println(forFive3(list1))//пустой лист
}

//обычная функция
fun forFive(list: List<Int>): List<Int> {
    require(list.isNotEmpty()) {"Список не должен быть пустым"}
    return list.toSet().toList()
}

//аналогичная анонимная функция
val forFive1 = fun (list: List<Int>): List<Int> {
    require(list.isNotEmpty()) {"Список не должен быть пустым"}
    return list.toSet().toList()
}

//лямбда выражение с указанием типа
val forFive2: (List<Int>) -> List<Int> = {list ->
    require(list.isNotEmpty()) {"Список не должен быть пустым"}
    list.toSet().toList()
}

//лямбда выражение без указания типа
val forFive3 = {list: List<Int> ->
    require(list.isNotEmpty()) {"Список не должен быть пустым"}
    list.toSet().toList()
}


