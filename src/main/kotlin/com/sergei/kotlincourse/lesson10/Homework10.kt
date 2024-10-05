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

//Работа со списками List
//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.

val simpleList: List<Int> = listOf(1, 2, 3)
println(simpleList)

//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента
//(например, "Hello", "World", "Kotlin").

val simpleListString: List<String> = listOf("Hello", "World", "Kotlin")
println(simpleListString)

//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.

val mutableSimpleList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
println(mutableSimpleList)

// Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые
//элементы (например, 6, 7, 8).

val mutableSimpleList1: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
mutableSimpleList1.add(6)
println(mutableSimpleList1)

//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент
//(например, "World").

val mutableStringleList1: MutableList<String> = mutableListOf("World","2"," ")
mutableStringleList1.remove("World")
println(mutableStringleList1)

//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода
//каждого элемента на экран.

val listFor: List<Int> = listOf(1, 2, 3, 4, 5)
for (i in listFor.indices) {
    println(listFor[i])
}

//Задание 7: Получение Элементов Списка по Индексу
//Создайте список строк и получите из него второй элемент, используя его индекс.

val listStringForPrint: List<String> = listOf("Нулевой индекс", "Первый индекс", "Второй индекс")
println(listStringForPrint[1])

//Задание 8: Перезапись Элементов Списка по Индексу
//Имея изменяемый список чисел, измените значение элемента на определенной
//позиции (например, замените элемент на позиции 2 на новое значение).

val mutableListFoChange: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
mutableListFoChange[1] = 100500
println(mutableListFoChange)

//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список,
//содержащий элементы обоих списков. Реши задачу с помощью циклов.

val listStringFirst: List<String> = listOf("один", "два", "три")
val listStringSecond: List<String> = listOf("четыре", "пять", "шесть")
val listStringSum: MutableList<String> = mutableListOf()

for (i in listStringFirst.indices) {
    listStringSum.add(listStringFirst[i])
}

for (i in listStringSecond.indices) {
    listStringSum.add(listStringSecond[i])
}

println(listStringSum)

//Задание 10: Нахождение Минимального/Максимального Элемента
//Создайте список целых чисел и найдите в нем минимальный и
//максимальный элементы используя цикл.

val listMaxAndMin: List<Int> = listOf(10, 20, 30, 40, 50)

var max = 0

var min = 0

for (i in listMaxAndMin.indices)
    if (listMaxAndMin[i] > max){
        max = listMaxAndMin[i]
    } else break

for (i in listMaxAndMin.indices)
    if (listMaxAndMin[i] < min){
        min = listMaxAndMin[i]
    } else break

 println(max)
 println(min)

//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список, содержащий
//только четные числа из исходного списка используя цикл.

val listForFilter: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)

val listAfterFilter: MutableList<Int> = mutableListOf()

for (i in listForFilter.indices) {
    if (listForFilter[i] % 2 ==0) {
        listAfterFilter.add(listForFilter[i])
    }
}
println(listAfterFilter)

//Работа с Множествами Set
//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.

val numbersSet: Set<Int?> = setOf()
println(numbersSet)

//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три
//различных элемента (например, 1, 2, 3).

val jastSet: Set<Int> = setOf(1, 2, 3)
println(jastSet)

//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его
//несколькими значениями (например, "Kotlin", "Java", "Scala").

val stringMutableSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
println(stringMutableSet)

//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы
//(например, "Swift", "Go").

val stringMutableSet1: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
stringMutableSet1.add("Swift")
stringMutableSet1.add("Go")
println(stringMutableSet1)

//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него
//определенный элемент (например, 2).

val mutableIntSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8)
mutableIntSet.remove(2)
println(mutableIntSet)

//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода
//каждого элемента на экран.

val jastSetInt: Set<Int> = setOf(1, 2, 3, 4, 5)

for (i in jastSetInt){
    println(i)
}

//Задание 7: Проверка Наличия Элемента в Множестве
//Создай функцию, которая принимает множество строк (set)
//и строку и проверяет, есть ли в множестве указанная строка.
//Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.

val stringSet2: Set<String> = setOf("Kotlin", "Java", "Scala")

val lookForIt = "Java"

var checker: Boolean = false

for (i in stringSet2){
    if (i == "Java")
        checker = true
    }

println(checker)

//Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество,
//содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.

val setStringFirst: Set<String> = setOf("один", "два", "три")
val setStringSecond: Set<String> = setOf("четыре", "пять", "шесть")
val setStringSum: MutableSet<String> = mutableSetOf()

for (i in setStringFirst) {
    setStringSum.add(i)
}

for (i in setStringSecond) {
    setStringSum.add(i)
}

println(setStringSum)

//Задание 9: Нахождение Пересечения Множеств
//Создайте два множества целых чисел и найдите их пересечение (общие элементы).
//Реши задачу через вложенные циклы.

val setForFind: Set<Int> = setOf(1, 2, 3, 4, 5)
val setForCheck: Set<Int> = setOf(5, 6, 7, 8, 9)

val intersection: MutableSet<Int> = mutableSetOf()

for (elementFind in setForCheck){
    for (elementCheck in setForFind){
        if (elementFind == elementCheck){
            intersection.add(elementFind)
        }
    }
}

println(intersection)

//Задание 10: Нахождение Разности Множеств
//Создайте два множества строк и найдите разность первого множества относительно
//второго (элементы, присутствующие в первом множестве, но отсутствующие во втором).
//Реши задачу через вложенные циклы и переменные флаги.

val setStringForFind: Set<String> = setOf("Kotlin", "Java", "Scala", "Swift", "Go")

val setStringForCheck: Set<String> = setOf("Kotlin", "Java", "Scala", "Swift",)

val intersectionForString: MutableSet<String> = mutableSetOf()

for (elementFind in setStringForFind) {
    var isFound = false

    for (elementCheck in setStringForCheck) {
        if (elementFind == elementCheck) {
            isFound = true
            break
        }
    }

    if (isFound == false) {
        intersectionForString.add(elementFind)
    }
}

println(intersectionForString)

//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.

val setStringForList: Set<String> = setOf("Kotlin", "Java", "Scala", "Swift", "Go")

val listFromSet: MutableList<String> = mutableListOf()

for (element in setStringForList){
    listFromSet.add(element)
}

println(listFromSet)