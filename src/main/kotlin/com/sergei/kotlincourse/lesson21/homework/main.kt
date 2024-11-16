package com.sergei.kotlincourse.lesson21.homework

import kotlin.collections.mapOf
import kotlin.collections.mapOf as mapOf1

fun main() {
//Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>, которая будет создавать карту из списков
//ключей и значений. Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val mapFor1: MutableMap<K, V> = mutableMapOf()
    for (i in 0 until minOf(keys.size, values.size)) {
            mapFor1[keys[i]] = values[i]
        }
    return mapFor1
        }

//Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет возвращать средний элемент списка, если он существует.

fun <T> getMiddleElement(list: List<T>): T? {
    return if (list.size % 2 != 0) {
        list[list.size / 2]
    }
    else null
    }


// 1. toMap

    val keys = listOf("a", "b", "c")
    val values = listOf(1, 2, 4, 8, 9)
    println(toMap(keys, values))

// 2. getMiddleElement

    val numbers = listOf(1, 2, 3, 4, 5)
    println(getMiddleElement(numbers))


//

    val mapper = PhrasesToListOfStrings()
    println(mapper.map("Господу Богу помолимся"))

//StringValidator

    val stringValidator = StringValidator()
    println(stringValidator.validate("Hola"))
    println(stringValidator.validate("   "))

// OddValidator

    val oddValidator = OddValidator()
    println(oddValidator.validate(4))
    println(oddValidator.validate(5))

// ListValidator
    val listValidator = ListValidator<Int>()
    println(listValidator.validate(listOf(1, 2, 3)))
    println(listValidator.validate(listOf(null, 1, 2)))

}


