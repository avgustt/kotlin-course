package com.sergei.kotlincourse.lesson22.homework.firsTask

//Тренируемся составлять сигнатуру функции расширяющей класс.
//Можешь проявить свою творческую жилку и в коде функции что-нибудь сделать с входящими данными,
//чтобы вернуть итоговый результат или распечатать его, если нет возвращаемого типа.

fun main() {

//Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел.

    fun <T: Number> Array<T>.setPair(): Pair<T, T>? {
        return if (this.size >= 2) {
            this[0] to this[1]
        }
        else return null
    }

    val array = arrayOf(1, 2, 3)
    println(array.setPair())

//Напишите функцию-расширение для класса символа, допускающего null, которая принимает три аргумента:
//два типа число и один булево, и ничего не возвращает.


    fun Char?.threeArguments(first: Number,second: Number, therd: Boolean) {
        println("ты кодишь как Боженька")
    }

    val nomberFor2 = '1'
    println(nomberFor2.threeArguments(1,2,true))

//Создайте функцию-расширение для класса изменяемого списка элементов с дженериком, которая принимает два аргумента:
//один типа дженерик, допускающий null, и другой типа число, и возвращает значение типа дженерик, допускающий null.

    fun <T> MutableList<T>.twoArguments(first: T?, second: Number): T? {

        return first
    }

        val list = mutableListOf(1, 2, 3)
        println(list.twoArguments(42, 10))


//Реализуйте функцию-расширение для класса словаря допускающего null с ключами дженериком и значениями
//типа список из такого же дженерика, которая принимает один аргумент типа число и возвращает словарь
//допускающий null с ключами типа строка и значениями типа дженерика допускающего null.

    fun <T> Map<T, List<T>>?.forMap(first: Number): Map<String, T?> {

        val result = mutableMapOf<String, T?>()

        this?.forEach { (key, value) ->
            result[key.toString()] = value.firstOrNull()
        }
        return result
    }

    val originalMap: Map<Int, List<Int>> = mapOf(1 to listOf(10, 20), 2 to listOf(30, 40))
    println(originalMap.forMap(1))

//Определите функцию-расширение для класса длинного числа, допускающее null, которая не принимает аргументов и возвращает строку.

    fun Number?.numberToString(): String {
        return this.toString()
    }

    val nombers = 123456789

    println(nombers.numberToString())

}