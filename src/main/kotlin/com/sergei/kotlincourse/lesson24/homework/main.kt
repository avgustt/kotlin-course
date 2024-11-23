package com.sergei.kotlincourse.lesson24.homework

fun main() {

    // Задание 2: Обернуть все вызовы в блок try-catch для каждого исключения
    try {
        triggerNullPointerException()
    } catch (e: NullPointerException) {
        println("NullPointerException: Нельзя вызвать метод на null")
    }

    try {
        triggerArrayIndexOutOfBoundsException()
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException: Индекс выходит за пределы массива")
    }

    try {
        triggerClassCastException()
    } catch (e: ClassCastException) {
        println("ClassCastException: Неверное приведение типов")
    }

    try {
        triggerNumberFormatException()
    } catch (e: NumberFormatException) {
        println("NumberFormatException: Невозможно преобразовать строку в число")
    }

    try {
        triggerIllegalArgumentException()
    } catch (e: IllegalArgumentException) {
        println("IllegalArgumentException: Елочка ему не нравится")
    }

    try {
        triggerIllegalStateException()
    } catch (e: IllegalStateException) {
        println("IllegalStateException: Не может быть false")
    }

    try {
        triggerOutOfMemoryError()
    } catch (e: OutOfMemoryError) {
        println("OutOfMemoryError: Превышен лимит доступной памяти")
    }

    try {
        triggerStackOverflowError()
    } catch (e: StackOverflowError) {
        println("StackOverflowError: Переполнение стека из-за бесконечной рекурсии")
    }

    // Задание 3: Использование одного блока catch с when для всех ошибок
    try {
        triggerNullPointerException()
        triggerArrayIndexOutOfBoundsException()
        triggerClassCastException()
        triggerNumberFormatException()
        triggerIllegalArgumentException()
        triggerIllegalStateException()
        triggerOutOfMemoryError()
        triggerStackOverflowError()
    } catch (e: Throwable) { // Перехват любого исключения
        when (e) {
            is NullPointerException -> println("NullPointerException: Нельзя вызвать метод на null")
            is ArrayIndexOutOfBoundsException -> println("ArrayIndexOutOfBoundsException: Индекс выходит за пределы массива")
            is ClassCastException -> println("ClassCastException: Неверное приведение типов")
            is NumberFormatException -> println("NumberFormatException: Невозможно преобразовать строку в число")
            is IllegalArgumentException -> println("IllegalArgumentException: Елочка ему не нравится")
            is IllegalStateException -> println("IllegalStateException: Не может быть false")
            is OutOfMemoryError -> println("OutOfMemoryError: Превышен лимит доступной памяти")
            is StackOverflowError -> println("StackOverflowError: Переполнение стека из-за бесконечной рекурсии")
            else -> println("Неизвестная ошибка")
        }
    }
}

//Задание 1. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:

fun triggerNullPointerException() {
    val str: String? = null
    println(str!!.length) // Здесь произойдет NullPointerException
}

fun triggerArrayIndexOutOfBoundsException() {
    val array = arrayOf(1, 2, 3)
    println(array[3]) // Здесь произойдет ArrayIndexOutOfBoundsException
}

fun triggerClassCastException() {
    val obj: Any = "это строка"
    val number = obj as Int // Здесь произойдет ClassCastException
}

fun triggerNumberFormatException() {
    val invalidNumber = "123abc"
    println(invalidNumber.toInt()) // Здесь произойдет NumberFormatException
}

fun triggerIllegalArgumentException() {
    fun calculateFactorial(n: Int) {
        require(n >= 0) { "Число должно быть неотрицательным" }
    }
    println(calculateFactorial(-5)) // Здесь произойдет IllegalArgumentException
}

fun triggerIllegalStateException() {
    check(false) { "Объект не был инициализирован" } // Здесь произойдет IllegalStateException
}

fun triggerOutOfMemoryError() {
    val largeList = mutableListOf("")
    while (true) {
        largeList.add("Ы") // Здесь произойдет OutOfMemoryError
    }
}

fun triggerStackOverflowError() {
    fun recursiveFunction() {
        recursiveFunction() // Здесь произойдет StackOverflowError
    }
    recursiveFunction()
}