package com.sergei.kotlincourse.lesson22.homework.extensions

//Задача 3: Переворот элементов пары
//Реализуйте метод расширения revert для класса Pair, который меняет местами первый и второй элементы пары.
//Метод должен возвращать новую пару с перевернутыми элементами. Протестируйте эту функцию на различных парах значений,
//в том числе null.

fun <A, B> Pair<A, B>.revert(): Pair<B, A> {
    return Pair(this.second, this.first)
}

fun main() {

    // 1

    val pair1 = Pair(1, 2)
    val reversedPair1 = pair1.revert()
    println("Отстойный оригинал: $pair1, Неповторимая копия: $reversedPair1")

    // 2

    val pair2 = Pair(42, "Hola")
    val reversedPair2 = pair2.revert()
    println("Отстойный оригинал: $pair2, Неповторимая копия: $reversedPair2")

    // 2

    val pair3 = Pair(null, 3)
    val reversedPair3 = pair3.revert()
    println("Отстойный оригинал: $pair3, Неповторимая копия: $reversedPair3")

    // 4

    val pair4 = Pair(null, null)
    val reversedPair4 = pair4.revert()
    println("Отстойный оригинал: $pair4, Неповторимая копия: $reversedPair4")

}