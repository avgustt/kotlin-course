package com.sergei.kotlincourse.lesson26.homework

import com.sergei.kotlincourse.lesson13.list

//1. Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.

fun functionFor1 (functionForFunctionFor1:() -> Unit) {}

//2. Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.

fun functionFor2 (functionForFunctionFor2: (arg: Int) -> String) {}

//3. Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.

fun functionFor3(functionExtension: Int.(String) -> Boolean) {
    val nomber = 42
    println(nomber.functionExtension("42"))
}

//4. Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.

fun <T> functionFor4(function: (T) -> List<T>){}

//5. Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию, принимающую Int и возвращающую Boolean

fun functionFor5 (function: (String) -> (Int) -> Boolean){
}

//6.Напишите функцию, которая принимает список чисел, множество строк, функцию с аргументами типа List<Int> и Set<String> и возвращающую Map<String, Int>.

fun functionFor6 (list: List<Number>, set: Set<String>, function: (listForfunction: List<Int>, setForfunction: Set<String>) -> Map<String, Int>){}

//7. Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строку

fun functionFor7 (number: Number, function: ((numberForFunction: Number) -> String) -> String) {}

//8. Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения.

fun functionFor8(function: () -> () -> Unit) {}

//9. Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки,
//удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение). Функция должна вернуть результат фильтрации исходного списка строк.

fun filterStrings(list: List<String>, funstion: (String) -> Boolean): List<String> {
    return list.filter { funstion(it) }
}

//10. Создайте функцию applyToNumbers, которая принимает список чисел и функцию, преобразующую каждое число в другое
//число (те-есть принимающая число и возвращающая число). Функция должна вернуть результат преобразования исходного списка чисел.

fun applyToNumbers(list: List<Number>, funstion: (Number) -> Number): List<Number> {
    return list.map(funstion)
}

val elementary: (Number) -> Number = {
    (it.toDouble() + 1).toInt()
}

//11. Реализуйте функцию sumByCondition, которая принимает список чисел и функцию, определяющую условие для включения числа в сумму.
// Функция должна вернуть сумму чисел, прошедших проверку.

fun sumByCondition (list: List<Int>, funstion11: (Int) -> Boolean): Int {
    return list.filter { funstion11(it) }.sum()
}

val for11: (Int) -> Boolean = {
    it > 0
}

//12Напишите функцию combineAndTransform, которая принимает две коллекции одного типа и функцию для их объединения и преобразования
//в одну коллекцию другого типа. Функция должна вернуть результат преобразования (коллекцию второго типа)

fun combineAndTransform(array1: Array<Int>, array2: Array<Int>, funstion12: (Int) -> String): Array<String>{
    return (array1 + array2).map{funstion12(it)}.toTypedArray()
}

val for12: (Int) -> String = {
    it.toString()
}

fun main() {

    //реализация функции для задания 3
    val name: Int.(String) -> Boolean = { it == this.toString() }

    functionFor3(name)


    //реализация функции для задания 9
    val strings = listOf("apple", "banana", "kiwi", "cherry", "fig")
    println(filterStrings(strings) {it.length > 3})

    val strings1 = listOf<String>("uno", "dos", "tres", "cuatro", "sinco")
    println(filterStrings(strings1) {it.length >= 4})

    //реализация функции для задания 10

    val numbers1 = listOf<Number>(1, 2, 3, 4, 5)
    val numbers2 = listOf<Number>(10, -6, 14, 2345, 0, 0)

    println(applyToNumbers(numbers1, elementary))
    println(applyToNumbers(numbers2, elementary))

    //реализация функции для задания 11


    val numbers3 = listOf<Int>(10, -6, 14, -2345, 0, 0)
    val numbers4 = listOf<Int>(1, -6, 14, 2, -55)

    println(sumByCondition(numbers3, for11))
    println(sumByCondition(numbers4, for11))


    //реализация функции для задания 12

    val array = arrayOf(10, -6, 14, -2345, 0, 0)
    val arrea1 = arrayOf(1, -6, 14, 2, -55)

    val array2 = arrayOf(0, 1, 2, 3)
    val arrea3 = arrayOf(4, 5, 6, 7)

    println(combineAndTransform(array, arrea1, for12).joinToString(", "))
    println(combineAndTransform(array2, arrea3, for12).joinToString(", "))

}