package com.sergei.kotlincourse.lesson19

class Student(name: String, age: Int, val studentId: Int) : Person(name, age) {

    // Публичный метод
    fun study() {
        // Используем защищённый метод getName() из родительского класса
        println("${getName()} учится.")
    }

}