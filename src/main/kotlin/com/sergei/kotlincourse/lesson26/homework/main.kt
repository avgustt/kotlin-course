package com.sergei.kotlincourse.lesson26.homework

//1. Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.

fun functionFor1 (functionForFunctionFor1:() -> Unit) {}

//2. Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.

fun functionFor2 (functionForFunctionFor2: (arg: Int) -> String) {}

//3. Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.

fun functionFor3(functionExtension: Int.(String) -> Boolean) {
    val nomber = 42
    println(nomber.functionExtension("42"))
}


fun main() {

    val name: Int.(String) -> Boolean = { it == this.toString() }

    functionFor3(name)

}