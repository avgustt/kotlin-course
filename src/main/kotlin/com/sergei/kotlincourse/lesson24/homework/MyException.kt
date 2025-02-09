package com.sergei.kotlincourse.lesson24.homework
//Задание 5. Создай свой тип исключения в отдельном файле, наследуемый от RuntimeException и принимающий
//ArrayIndexOutOfBoundsException тип в качестве аргумента.
//Напиши код, который спровоцирует выброс ArrayIndexOutOfBoundsException, перехвати его с помощью try-catch и в
//блоке catch выведи сообщение в консоль и сделай выброс своего типа исключения.

class MyException(cause: ArrayIndexOutOfBoundsException): RuntimeException("это сообщение которое я сам сюда добавил и оно распечатается красным цветом, когда исключение сработает", cause)

fun main() {
    try {
        val array = arrayOf(1, 2, 3)
        println(array[5])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Случилась ошибка - ArrayIndexOutOfBoundsException: ${e}")
        throw MyException(e)
    }
}