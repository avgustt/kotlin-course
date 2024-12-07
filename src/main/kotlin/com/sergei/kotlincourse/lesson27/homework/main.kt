package com.sergei.kotlincourse.lesson27.homework

import java.awt.AWTEventMulticaster.add
import kotlin.apply

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

val employee = Employee(
    name = "Ivan",
    age = 30,
    position = "хорошая",
).apply {
    email = "e-mail"
    department = "Главный"
}

//Задание 3: Использование also для логирования
//Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом,
//отформатированном виде.
//Создайте объект Person и используйте also для печати данных в консоль с помощью метода который
//только что создали.

val persona = Person(
    name = "Fedor",
    age = 60,
).apply {
    email = "телеграф@помолимся"
}

fun functiomFor3(obj: Person){
    obj.also {
        println("⋆༺\uD80C\uDDA9☠\uFE0E\uFE0E\uD80C\uDDAA༻⋆")
        println("Нашему ${it.name} ${it.age} лет")
        println("⋆༺\uD80C\uDDA9☠\uFE0E\uFE0E\uD80C\uDDAA༻⋆")
        println("адрес его электронной почты: ${it.email}")
        println("⋆༺\uD80C\uDDA9☠\uFE0E\uFE0E\uD80C\uDDAA༻⋆")
        println("очень красиво получилось")
    }
}

//Задание 4: Использование with для преобразование Person в Employee
//Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee,
//указав дополнительно должность. Возвращаемым значением должен быть новый объект Employee.

val employee1 = with(persona) {
    Employee(
        name = this.name,
        age = this.age,
        position = "Developer"
    ).apply {
        email = "this@with"
        department = "IT"
    }
}

fun main() {

//реализация 1 задания:
    val elapsedTime = timeTracker(myFunction)
    println(elapsedTime)

//реализация 3 задания:
functiomFor3(persona)

//проверяю создание 4 задания:
println("Employee: ${employee1.name}, ${employee1.age}, ${employee1.email}, ${employee1.department}")

}