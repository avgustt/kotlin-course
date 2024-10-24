package com.sergei.kotlincourse.lesson15

fun main() {

    val person = Person("John", 30)
    person.sayHello()
}
class Person(val name: String, var age: Int) {

    // Метод класса
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

object Logger {

    fun log(message: String) {
        println("Log: $message")
    }
}

class Calculator {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}

