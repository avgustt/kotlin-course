package com.sergei.kotlincourse.lesson25.homework

//Задание 4. Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
//Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()

fun main() {
    val number: Long = 5645115615611546513
    val number1: Long = 946546544615468774
    val number2: Long = -1

    println(forFor3(number))//проверка, что лямбда выражение работает правильно
    println(forFor3(number1))//проверка, что лямбда выражение работает правильно c другим числом
    println(forFor3(number2))//с отрицательным числом
}

//обычная функция
fun forFor (number: Long): Int {
    require(number >= 0) { "Число должно быть неотрицательным" }
    return number.toString().sumOf { it.digitToInt() }
}

//аналогичная анонимная функция
val forFor1 = fun (number: Long): Int {
    require(number >= 0) { "Число должно быть неотрицательным" }
    return number.toString().sumOf { it.digitToInt() }
}

//лямбда выражение с указанием типа
val forFor2: (Long) -> Int = {number ->
    require(number >= 0) { "Число должно быть неотрицательным" }
    number.toString().sumOf { it.digitToInt() }
}

//лямбда выражение без указания типа
val forFor3 = { number: Long ->
    require(number >= 0) { "Число должно быть неотрицательным" }
    number.toString().sumOf { it.digitToInt() }
}
