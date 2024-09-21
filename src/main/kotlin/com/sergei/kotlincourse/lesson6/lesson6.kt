package com.sergei.kotlincourse.lesson6

import java.time.Month
import kotlin.time.TimeMark

fun main () {
    println(seasons(month)) //Задание 1
    println(calculationOfYears(yearOfDog)) //Задание 2
    println(whatIsBetter(way)) //Задание 3
    println(calculationOfBonus(shopping)) //Задание 4
    println(fileType(fileExtension))//Задание 5
    println(conversion(21.0, "C"))//Задание 6
    println(conversion(69.8, "F"))//Задание 6
    println(recommends(airTemperature))//Задание 7
    println(filmsСategories(age))//Задание 8
}

//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.

val month: Int = 9

fun seasons(month: Int): String {
    return if (month in 1..2 || month == 12) {
        "Winter"
    } else if (month in 3..5) {
        "Spring"
    } else if (month in 6..8) {
        "Summer"
    } else if (month in 9..11) {
        "Autumn"
    } else {
        "Invalid month"
    }
}

//Задание 2: "Расчет Возраста Питомца"
//Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
// До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.


val yearOfDog: Int = 5

fun calculationOfYears(yearOfDog: Int) : Any {
    return if (yearOfDog <= 2) {
        yearOfDog * 10.5
    }
    else {
        (yearOfDog - 2) * 4 + 21
    }
}

//Задание 3: "Определение Вида Транспорта"
//Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

val way: Int = 6

fun whatIsBetter(way: Int) : String {
    return if (way < 1)  {
        "пешком"
    } else if (way in 1..4) {
        "велосипед"
    } else {
        "автотранспорт"
    }
}

//Задание 4: "Расчет Бонусных Баллов"
//Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию,
// которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей
// при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.

val shopping: Int = 1500

fun calculationOfBonus(shopping: Int) : Int {
    return when  {
        shopping < 1000 -> shopping / 100 * 2
        shopping >= 1000 -> shopping / 100 * 5
        else -> 0
    }
}

//Задание 5: "Определение Типа Документа"
//Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию,
// которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица"
// или "Неизвестный тип".

val fileExtension: String = "xl"

fun fileType(fileExtension: String) : String {
    return if (fileExtension == "txt") {
        "Текстовый документ"
    } else if (fileExtension == "jpg") {
        "Изображение"
    } else if (fileExtension == "xl") {
        "Таблица"
    } else {
        "Неизвестный тип"
    }
}

//Задание 6: "Конвертация Температуры"
//Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты
// и наоборот в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно
// передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку.
//Подсказка: для генерации строки из числа и буквы можно использовать шаблон “$result F”
// для фаренгейта или “$result C” для цельсия

fun conversion(temperature: Double, scale: String): String {
    return if (scale == "C") {
        val result = temperature * 9 / 5 + 32
        "$result F"
    } else if (scale == "F") {
        val result = (temperature - 32) * 5 / 9
        "$result C"
    } else {
        "Invalid scale"
    }
}

//Задание 7: "Подбор Одежды по Погоде"
//Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды:
// "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты"
// при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

val airTemperature: Int = 25

fun recommends(airTemperature: Int) : String {
    return if (airTemperature in -30 downTo -1) {
        "куртка и шапка"
    } else if (airTemperature in 0..14)  {
        "ветровка"
    } else if (airTemperature in 15..35)  {
        "футболка и шорты"
    } else {
        "не выходить из дома"
    }
}

//Задание 8: "Выбор Фильма по Возрасту"
//Контекст: Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию,
// которая принимает возраст зрителя и возвращает доступные для него категории фильмов:
// "детские", "подростковые", "18+".

val age: Int = 25

fun filmsСategories(age: Int) : String {
    return when  {
        age in 0..12 -> "детские"
        age in 13..17 -> "подростковые"
        else -> "18+"
    }
}