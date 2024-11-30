package com.sergei.kotlincourse.lesson25.homework

import com.sergei.kotlincourse.lesson13.list

//Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка.
//С помощью require проверь, что список не пустой.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).


//обычная функция
fun forList (a: List<Int>): Double {
    require(a.isNotEmpty()) {"Список не должен быть пустым"}
    return a.average()
}

//аналогичная анонимная функция
val forList1 = fun (a: List<Int>): Double {
    require(a.isNotEmpty()) {"Список не должен быть пустым"}
    return a.average()
}

//лямбда выражение с указанием типа
val forList2: (List<Int>) -> Double = { a ->
    require(a.isNotEmpty()) {"Список не должен быть пустым"}
    a.average()
}

//лямбда выражение без указания типа
val forList3 = {a: List<Int> ->
    require(a.isNotEmpty()) {"Список не должен быть пустым"}
    a.average()

}

fun main() {

    val list = listOf<Int>(1, 3, 7, 9, 8, 10)
    val list1 = listOf<Int>(10, 53, 67, 19, 0, 0)
    val list2 = listOf<Int>()


    println(forList3(list))//проверка, что лямбда выражение работает правильно
    println(forList3(list1))//проверка, что лямбда выражение работает правильно со вторым списком
    println(forList3(list2))//проверка, что лямбда выражение работает правильно с пустым списком

}