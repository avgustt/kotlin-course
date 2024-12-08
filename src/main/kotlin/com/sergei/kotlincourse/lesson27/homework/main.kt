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

//Задание 5: Использование run для преобразования и инициализации Employee
//Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee,
//добавить ему email и department с помощью apply, вернуть инициализированный объект.

val personaNext = Person(
    name = "Innokentii",
    age = 50,
).run {
    Employee(
    name = this.name,
    age = this.age,
    position = "Полковник",
    ).apply {
        email = "thees@with"
        department = "IT"
    }
}

//Задание 6: Использование let для безопасного преобразования Person в Employee
//Создайте функцию, которая принимает объект класса Person?, который может быть null.
//В функции используйте функцию let для создания Employee, только если объект Person не null.
//В противном случае возвращается null



fun functionFor6(obj: Person?): Employee?{
   return obj?.let {
        Employee(
            name = it.name,
            age = it.age,
            position = "Примарх"
            ).apply {
            email = it.email
            department = "IX легион"
        }
    }
}


fun main() {

//реализация 1 задания:
    val elapsedTime = timeTracker(myFunction)
    println(elapsedTime)

//реализация 3 задания:
functiomFor3(persona)

//проверяю создание 4 задания:
println("${employee1.name}, ${employee1.age}, ${employee1.email}, ${employee1.department}, ${employee1.position}")

//проверяю создание 5 задания:
println("${personaNext.name}, ${personaNext.age}, ${personaNext.email}, ${personaNext.department}, ${personaNext.position}")

//проверяю создание 6 задания:

val otraPersona = Person(
    name = "Сангвиний",
    age = 300
).apply {
    email = "дворец@императора"
}

val employee6 = functionFor6(otraPersona)
println("${employee6?.name}, ${employee6?.age}, ${employee6?.email}, ${employee6?.department}, ${employee6?.position}")

val nullPerson: Person? = null
println(functionFor6(nullPerson))
}