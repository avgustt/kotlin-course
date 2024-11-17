package com.sergei.kotlincourse.lesson22.homework.extensions

fun main() {


//Напишите функцию-расширение для класса символа, допускающего null, которая принимает три аргумента:
//два типа число и один булево, и ничего не возвращает.


    fun Char?.threeArguments(first: Number, second: Number, therd: Boolean) {
        println("ты кодишь как Боженька")
    }

    val nomberFor2 = '1'
    println(nomberFor2.threeArguments(1, 2, true))

}