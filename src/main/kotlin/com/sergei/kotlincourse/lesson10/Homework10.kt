package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson10

import kotlin.collections.indices
import kotlin.collections.indices as indices1

fun main() {
//Работа с массивами Array

//Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

    val arrayFrom1To1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(arrayFrom1To1.toList())

//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.

    val emptyArray10 = Array(10) { "" }
    println(emptyArray10.toList())

//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями,
//являющимися удвоенным индексом элемента.

    val Array5 = Array(5) { 1.0 }
    for (i in Array5.indices) {
        Array5[i] = 2.0 * i
    }
    println(Array5.toList())

//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл,
//чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

    val array5For: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for (i in array5For.indices) {
        array5For[i] = 3 * i
    }
    println(array5For.toList())

//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк. Инициализируйте его одним
//null значением и двумя строками.

    val arrayNull: Array<String?> = arrayOf(null, " ", " ")
    println(arrayNull.toList())

//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.

    val arrayPast: Array<Int> = arrayOf(10, 20, 30, 40, 50)
    val arrayCopy = MutableList<Int>(4) { 1 }

    for (i in arrayPast.indices) {
        if (i < arrayCopy.size) {
            arrayCopy[i] = arrayPast[i]
        } else arrayCopy.add(arrayPast[i])
    }
    println(arrayCopy.toList())

//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины.
//Создайте третий массив, вычев значения одного из другого.

    val arrayFirst: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val arraySecond: Array<Int> = arrayOf(6, 7, 8, 9, 10)

    val arrayDifference = MutableList<Int>(5) { 1 }

    for (i in arrayDifference.indices)
        arrayDifference[i] = arraySecond[i] - arrayFirst[i]
    println(arrayDifference.toList())

//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел. Найдите индекс элемента со значением 5.
//Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.

    val arrayFoWhile: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    var index = 0

    var foundIndex = -1

    while (index < arrayFoWhile.size) {
        if (arrayFoWhile[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }
    println(foundIndex)

//Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива
//и вывода каждого элемента в консоль. Напротив каждого элемента должно
//быть написано “чётное” или “нечётное”.

    var arrayIntegers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    for (i in arrayIntegers.indices) {
        if (arrayIntegers[i] % 2 == 0) {
            println("${arrayIntegers[i]} чётное")
        } else {
            println("${arrayIntegers[i]} нечётное")
        }
    }

//Задание 10: Поиск Значения в Массиве по вхождению

    foundString(arrayString, searchString)
}

//Создай функцию, которая принимает массив строк и строку для поиска.
//Функция должна находить в массиве элемент, в котором принятая строка является
//подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.

val arrayString: Array<String> = arrayOf("Я гений","Я дурак","Средний интелект","Бу-Га-Га")
val searchString = "дурак"

fun foundString (array: Array<String>, searchString: String) {
    for (element in array) {
        if (element.contains(searchString)) {
            println(element)
            return
        }
    }
    println("Ничего не нашел")
}

//    Работа со списками List
//            Задание 1: Создание Пустого Списка
//    Создайте пустой неизменяемый список целых чисел.
//    Задание 2: Создание и Инициализация Списка
//    Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
//    Задание 3: Создание Изменяемого Списка
//    Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
//    Задание 4: Добавление Элементов в Список
//    Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
//    Задание 5: Удаление Элементов из Списка
//    Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
//    Задание 6: Перебор Списка в Цикле
//    Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
//    Задание 7: Получение Элементов Списка по Индексу
//    Создайте список строк и получите из него второй элемент, используя его индекс.
//    Задание 8: Перезапись Элементов Списка по Индексу
//    Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
//    Задание 9: Объединение Двух Списков
//    Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
//    Задание 10: Нахождение Минимального/Максимального Элемента
//    Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
//    Задание 11: Фильтрация Списка
//    Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
//    Работа с Множествами Set
//            Задание 1: Создание Пустого Множества
//    Создайте пустое неизменяемое множество целых чисел.
//    Задание 2: Создание и Инициализация Множества
//    Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
//    Задание 3: Создание Изменяемого Множества
//    Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
//    Задание 4: Добавление Элементов в Множество
//    Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
//    Задание 5: Удаление Элементов из Множества
//    Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
//    Задание 6: Перебор Множества в Цикле
//    Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
//    Задание 7: Проверка Наличия Элемента в Множестве
//    Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
//    Задание 8: Объединение Двух Множеств
//    Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
//    Задание 9: Нахождение Пересечения Множеств
//    Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
//    Задание 10: Нахождение Разности Множеств
//    Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.
//    Задание 11: Конвертация Множества в Список
//    Создайте множество строк и конвертируйте его в список с использованием цикла.

