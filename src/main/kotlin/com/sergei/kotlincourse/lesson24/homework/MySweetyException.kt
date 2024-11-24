package com.sergei.kotlincourse.lesson24.homework
//Задание 4. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError и принимающий текст.
//Выброси это исключение в main

class MySweetyException(message: String):AssertionError(message)

fun main() {
    try {
       throw MySweetyException("я сделял")
    } catch (e: MySweetyException) {
        println("одна ошибка и ты ошибся")
    }
}