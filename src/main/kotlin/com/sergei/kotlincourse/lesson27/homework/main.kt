package com.sergei.kotlincourse.lesson27.homework

//Задание 1. Функция высшего порядка.
//
//Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента и измеряет
//время её выполнения. Функция timeTracker должна возвращать затраченное время в миллисекундах.
//Для измерения времени используйте System.currentTimeMillis() до и после выполнения переданной
//функции.

fun timeTracker(function: () -> List<Int>): Long {

    val startTime = System.currentTimeMillis()

    function()

    val endTime = System.currentTimeMillis()

    return endTime - startTime
}

val myFunction = {
    val list = List(10000000) { (0..10000).random() }
    list.sorted()

}

//Задания для работы со scope функциями
//Давайте создадим два класса, которые будут использоваться в заданиях для демонстрации работы
//scope функций с преобразованием объектов и инициализацией или обновлением полей. Классы будут
//представлять собой Person и Employee, где Employee может быть создан на основе данных класса Person.
////Классы для демонстрации
//
//Задание 2: Использование apply для инициализации объекта Employee
//Создайте объект Employee и используйте apply для инициализации его полей email и department.



fun main() {

//реализация 1 задания:

    val elapsedTime = timeTracker(myFunction)
    println(elapsedTime)

//

val employee = Employee("Ivan", 12, "устойчивая")


}