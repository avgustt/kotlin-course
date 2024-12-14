package com.sergei.kotlincourse.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal


//Задача 1: Создай текущую временную метку и выведи её на печать
//(чтобы ещё раз запомнить название этого класса)

fun task1() {
    val currentTimestamp = Instant.now()
    println("Текущая временная метка: $currentTimestamp")
}

//Задача 2: Создай дату своего дня рождения.

fun task2() {
    val birthDate = LocalDate.of(1987, 10, 7)
    println("Дата моего рождения: $birthDate")
}

//Задача 3: Создай период между датой своего рождения и текущей датой.
//Выведи на печать количество лет из этого периода.

fun task3() {
    val birthDate = LocalDate.of(1987, 10, 7)
    val currentDate = LocalDate.now()
    val period = Period.between(birthDate, currentDate)
    println("Прошло лет с моего рождения: ${period.years}")
}

//Задача 4: Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
//содержит ли аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени.
//В форматированном значении нужно выводить часы, минуты, секунды и таймзону, если они представлены в переданном объекте.
//Обработай в методе все типы дат, которые знаешь.
//Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.

fun formatAnyDate(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> println("Дата: ${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))}")
        is LocalTime -> println("Время: ${temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))}")
        is LocalDateTime -> println("Дата и время: ${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))}")
        is ZonedDateTime -> println("Дата, время и часовой пояс: ${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))}")
        is OffsetDateTime -> println("Дата, время и часовой пояс: ${temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))}")
        else -> println("Неизвестный формат: $temporal")
    }
}

fun formatAnyDateByIso(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> println("ISO Дата: ${temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)}")
        is LocalTime -> println("ISO Время: ${temporal.format(DateTimeFormatter.ISO_TIME)}")
        is LocalDateTime -> println("ISO Дата и время: ${temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}")
        is ZonedDateTime -> println("ISO Полная дата: ${temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)}")
        is OffsetDateTime -> println("ISO Смещение: ${temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)}")
        else -> println("Неизвестный ISO формат: $temporal")
    }
}

//Задача 5: Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше.
//Не используй в них метод now()

fun task5() {
    val date = LocalDate.of(2000, 5, 15)
    val time = LocalTime.of(14, 30)
    val dateTime = LocalDateTime.of(2000, 5, 15, 14, 30)
    val zonedDateTime = ZonedDateTime.of(2000, 5, 15, 14, 30, 0, 0, ZoneId.of("UTC"))

    println("Собственное форматирование:")
    formatAnyDate(date)
    formatAnyDate(time)
    formatAnyDate(dateTime)
    formatAnyDate(zonedDateTime)

    println("\nISO форматирование:")
    formatAnyDateByIso(date)
    formatAnyDateByIso(time)
    formatAnyDateByIso(dateTime)
    formatAnyDateByIso(zonedDateTime)
}

//Задача 6: Создайте функцию identifyGeneration, которая принимает дату рождения в
//формате LocalDate и печатает строку, определяющую, к какому поколению принадлежит человек:
//"Бумер" для тех, кто родился с 1946 по 1964 год включительно, и
//"Зумер" для тех, кто родился с 1997 по 2012 год включительно.
//Если дата рождения не попадает ни в один из этих диапазонов, функция должна возвращать
//"Не определено". Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate).
//Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.

private val boomerStartDate = LocalDate.of(1946, 1, 1)
private val boomerEndDate = LocalDate.of(1964, 12, 31)
private val zoomerStartDate = LocalDate.of(1997, 1, 1)
private val zoomerEndDate = LocalDate.of(2012, 12, 31)

fun identifyGeneration(date: LocalDate) {
    when {
        date.isAfter(boomerStartDate.minusDays(1)) && date.isBefore(boomerEndDate.plusDays(1)) -> println("Бумер")
        date.isAfter(zoomerStartDate.minusDays(1)) && date.isBefore(zoomerEndDate.plusDays(1)) -> println("Зумер")
        else -> println("Не определено")
    }
}

fun task6() {
    val birthDate = LocalDate.of(2000, 5, 15)
    identifyGeneration(birthDate)
}

//Задача 7 :Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года.
//Создай форматтер, который форматирует дату в месяц и день.
//Выведи первую отформатированную дату, прибавив к ней 10 дней.
//Выведи вторую отформатированную дату, прибавив к ней 10 дней.
//Найди отличия)))

fun task7() {
    val date1 = LocalDate.of(2023, 2, 25)
    val date2 = LocalDate.of(2024, 2, 25)

    val formatter = DateTimeFormatter.ofPattern("dd MMMM")

    val updatedDate1 = date1.plusDays(10)
    val updatedDate2 = date2.plusDays(10)

    println("Первая дата: ${updatedDate1.format(formatter)}")
    println("Вторая дата: ${updatedDate2.format(formatter)}")
}

fun main() {
    println("Задача 1:")
    task1()

    println("\nЗадача 2:")
    task2()

    println("\nЗадача 3:")
    task3()

    println("\nЗадача 4, 5:")
    task5()

    println("\nЗадача 6:")
    task6()

    println("\nЗадача 7:")
    task7()
}
