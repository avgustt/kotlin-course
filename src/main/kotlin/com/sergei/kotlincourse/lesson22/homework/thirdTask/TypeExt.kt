package com.sergei.kotlincourse.lesson22.homework.thirdTask

import kotlin.math.absoluteValue

//Задача 4: Проверка допустимого отклонения числа
//Реализуйте метод расширения within для класса Number, который проверяет, что текущее число отклоняется от эталонного
//не более допустимого значения. Метод принимает два параметра: other — число для сравнения и deviation — максимально
//допустимое отклонение. Метод должен возвращать true, если разница между текущим числом и числом для сравнения не
//превышает заданное отклонение. Протестируйте функцию на разных типах чисел. Для получения отклонения, у разницы
//чисел нужно вызвать свойство absoluteValue.

fun main() {

    fun Number.within(other: Number, deviation: Number): Boolean {

        val difference = (this.toDouble() - other.toDouble()).absoluteValue
        return difference <= deviation.toDouble()
    }

    println(10.within(12, 2))

    println((-10).within(15, 10))

    println(1.234.within(1.235, 0.001))

    println(10L.within(10.5, 0.5))
}