package com.sergei.kotlincourse.lesson7

fun main() {

//Вывод чисел от 1 до 10: Напишите программу, которая выводит числа от 1 до 10 с использованием цикла while.

var from1To10 = 1
    while (from1To10 <= 10)
        println(from1To10++)

//Четные числа до 20: Используя цикл while, выведите все четные числа от 2 до 20.

    var from1To20 = 2

    while (from1To20 <= 20) {
        if (from1To20 % 2 == 0)
            println(from1To20)
        from1To20++
    }

//Сумма чисел от 1 до 50: Напишите программу, которая суммирует числа от 1 до 50 с помощью цикла while.

    var sumFrom1To50 = 1
    var sum = 0
    while (sumFrom1To50 <=50) {
        sum += sumFrom1To50
        sumFrom1To50++
    }
        println(sum)

//Вывод чисел от 10 до 1: Используя цикл do while, выведите числа от 10 до 1.

    var from10to1OnDo = 10

    do {
        println(from10to1OnDo)
        --from10to1OnDo
    } while (from10to1OnDo > 0)
    println(from10to1OnDo)


}