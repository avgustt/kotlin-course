package com.sergei.kotlincourse.lesson25.homework

//Задание 6. Создай функцию расширение словаря из строк и чисел, которая принимает число и возвращает список ключей,
//длина которых меньше их значений но больше заданного в функции аргумента. В случае если список получается пустой нужно
//выкинуть исключение IllegalState.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

fun main() {
    val mapToSix = mapOf<String, Int>(
        "uno" to 1,
        "dos" to 2,
        "tres" to 3,
        "cuatro" to 4,
        "cinco" to 5,
        "seis" to 6,
        "siete" to 7,
        "ocho" to 8,
        "nueve" to 9,
        "diez" to 10
    )

    println(mapToSix.toSix3(3))//проверка, что лямбда выражение работает правильно
    println(mapToSix.toSix3(6))//пустой лист
}

//обычная функция
fun Map<String, Int>.toSix(minLength: Int): List<String> {
    val result = this.filter { (key, value) -> key.length < value && key.length > minLength }.keys.toList()
    if (result.isEmpty()) {
        throw IllegalStateException("Список ключей пуст")
    }
    return result
}

//аналогичная анонимная функция
val toSix1: Map<String, Int>.(Int) -> List<String> = fun Map<String, Int>.(minLength: Int): List<String> {
    val result = this.filter { (key, value) -> key.length < value && key.length > minLength }.keys.toList()
    if (result.isEmpty()) {
        throw IllegalStateException("Список ключей пуст")
    }
    return result
}

//лямбда выражение с указанием типа
val toSix2: Map<String, Int>.(Int) -> List<String> = { minLength ->
    val result = this.filter { (key, value) -> key.length < value && key.length > minLength }.keys.toList()
    if (result.isEmpty()) {
        throw IllegalStateException("Список ключей пуст")
    }
    result
}

//лямбда выражение без указания типа
val toSix3: Map<String, Int>.(Int) -> List<String> = { minLength ->
    val result = this.filter { (key, value) -> key.length < value && key.length > minLength }.keys.toList()
    if (result.isEmpty()) {
        throw IllegalStateException("Список ключей пуст")
    }
    result
}