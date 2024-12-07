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



fun main() {

    //реализация функции для задания 3
    val name: Int.(String) -> Boolean = { it == this.toString() }

    functionFor3(name)


    //реализация функции для задания 9
    val strings = listOf("apple", "banana", "kiwi", "cherry", "fig")
    println(filterStrings(strings) {it.length > 3})

    val strings1 = listOf<String>("uno", "dos", "tres", "cuatro", "sinco")
    println(filterStrings(strings1) {it.length >= 4})

    //

}