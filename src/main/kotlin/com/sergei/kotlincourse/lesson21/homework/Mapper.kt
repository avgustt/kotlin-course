package com.sergei.kotlincourse.lesson21.homework

//Создайте интерфейс Mapper<T, R>, который будет определять метод для преобразования элементов типа T в элементы типа R.

interface Mapper<T, R> {

    fun map(element: T): R


    fun mapList(element: List<T>): List<R>

}