package com.sergei.kotlincourse.lesson12

fun main () {

    println( multiplyByTwo(6)) // Задание 1

    println(isEven(5)) // Задание 2

    println(printNumbersUntil(4)) // Задание 3

    println(findFirstNegative(listOf(1, 2, 3, -4, -7)))  // Задание 4

    println(processList(listOf("as", "aasdas", "as", "asdasd", "132", null, "45"))) // Задание 5

    drawRectangle(5, -1) // Задание на оптимизацию функции

}
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.

fun nothing () {}

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.

fun sumFromTwoТumbers (fist: Int, second: Int): Int = fist + second

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.

fun getStrind (string: String): Unit {}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.

fun midlFromList (numbers: List<Int>): Double {
    var sum = 0
    for (i in numbers.indices) {
        sum += numbers[i]
    }
    return sum / numbers.size.toDouble()
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

fun nullableString (string: String?): Int? {
    return string?.length
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.

fun backInt (): Double? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.

fun getNullList (numbers: List<Int?>): Unit {}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.

fun getNumberForBackStringNull (number: Int): String? {
    return null
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.

fun getNothingBackListIntNull (): List<String>? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.

fun getNullStringBackBulletNull (word: String?, number: Int?): Boolean? {
    return null
}

//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(number: Int): Int = number * 2

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

fun isEven(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    }
    else return false
}

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n
//меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int) {
    if (n < 1) return
for (i in 1..n) {
    println(i)
}
//    var number = 1
//    while (number <= n) {
//        println(number)
//        number++
//    }
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в
//списке. Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative(list: List<Int>): Int? {
    for (i in list) {
        if (i < 0) {
            return i
        }
    }
    return null
}
//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую
//строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

fun processList(list: List<String?>) {
    for (i in list) {
        if (i == null){
            return
        }   else {
            println(i)
        }
    }
}

//Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.

//Сначала сделай запуск функции и посмотри на результат её работы. Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.

private fun checkIntFor0(number: Int, name: String) {
    if (number <= 0) throw IllegalArgumentException("$name должно быть положительным и больше нуля")
}

private fun horizontal(line: Int) {
    var topLine = "+"
    for (i in 1 until line - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)
}

private fun vertical(lefLine: Int, rightLine: Int ) {
    for (i in 1 until lefLine - 1) {
        var middleLine = "|"
        for (j in 1 until rightLine - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }
}

fun drawRectangle(width: Int, height: Int) {
    checkIntFor0(width, "width")
    checkIntFor0(height, "height")
    // Верхняя граница
    horizontal(width)
    // Боковые границы
    vertical(height, width)
    // Нижняя граница
    horizontal(width)
}
