package com.sergei.kotlincourse.lesson23.homework

fun main() {

//Задача 1
//Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна определить тип аргумента и вывести соответствующее сообщение:
//Для строки: "Это строка: [значение]".
//Для целого числа: "Это целое число: [значение]".
//Для списка: "Это список, количество элементов: [количество]".
//Для карты: "Это карта, количество пар: [количество]".
//Для остальных типов: "Неизвестный тип данных".
//Используйте оператор is для проверки типов.

    fun analyzeDataType (i: Any) {
        when (i) {
            is String -> println("Это строка: $i")
            is Int -> println("Это целое число: $i")
            is List<*> -> println("Это список, количество элементов:${i.size}")
            is Map<*,*> -> println("Это карта, количество пар: ${i.size}")
            else -> println("Неизвестный тип данных")

        }
    }

    val va = listOf<Any?>(null)
    analyzeDataType(va)

//Задача 2
//Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка, если аргумент можно безопасно
//привести к типу List. В случае неудачного приведения функция должна возвращать -1.
//Используйте as? для безопасного приведения типа.

    fun safeCastToList (i: Any?): Int {
        val list = i as? List<*>
        return list?.size ?: -1
    }
    println(safeCastToList(listOf(1, 2, 3)))
    println(safeCastToList("Не список"))
    println(safeCastToList(null))

//Задача 4
//Создайте функцию, которая принимает параметр типа Any.
//Функция гарантированно ожидает число (в виде числа или строки, например 4 или 4.2 или “4.2”)
//и должна вернуть квадрат этого числа. Если придёт число, его нужно возвести в квадрат, если придёт строка,
//то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.

    fun squaring (i: Any) {

        return when (i) {
            is Number -> println(i.toDouble() * i.toDouble())
            is String -> println(i.toDouble() * i.toDouble())
            else -> println("Не строка и не числа а дермище какое-то ")
        }

    }
    squaring(4)
    squaring("4")

//Задача 5
//Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает сумму всех
//целочисленных (Int) и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.

    fun sumIntOrDoubleValues (element: List<Any?>): Double {
        var sum = 0.0
        for (i in element)
            when (i) {
                is Int -> sum += i
                is Double -> sum += i
                }
    return sum
    }

    val mixedList = listOf(1, 2.5, "Hello", 4, 3.0, null, 'A')
    println(sumIntOrDoubleValues(mixedList))

//Задача 6
//Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести его к типу List<*>.
//Если приведение успешно, функция должна напечатать все строки из списка, если элемент не является строкой то вывести
//предупреждение об этом. Если приведение неудачно, должно быть выведено сообщение об ошибке, не прерывая выполнение программы.

    fun tryCastToListAndPrint(i: Any) {
        (i as? List <*>)?.forEach {
            val result = (it as? String) ?: "Элемент не является строкой"
            println(result)
        } ?: println("Не является списком")
    }


    tryCastToListAndPrint(121)
    tryCastToListAndPrint("asd")


}