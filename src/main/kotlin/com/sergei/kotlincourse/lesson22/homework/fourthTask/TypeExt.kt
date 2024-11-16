package com.sergei.kotlincourse.lesson22.homework.fourthTask

//Задача 5: Кодер-декодер строк
//Реализуйте для класса String два метода расширения: encrypt и decrypt. Метод encrypt должен сдвигать каждый символ
//исходной строки на заданное число позиций вперед по таблице Unicode, а метод decrypt — на то же число позиций назад.
//Оба метода принимают один параметр base типа Int, который определяет величину сдвига. Протестируйте вашу реализацию,
//убедившись, что после шифрования и последующей расшифровки строка возвращается к исходному состоянию.
//Сдвиг по таблице Unicode реализуется простым прибавлением или вычитанием размера сдвига к char символу.


//сдвиг вперед
fun String.encrypt(base: Int): String {
    return this.map { char -> (char.code + base).toChar() }.joinToString("")
}

//сдвиг назад
fun String.decrypt(base: Int): String {
    return this.map { char -> (char.code - base).toChar() }.joinToString("")
}

fun main() {

    val original = "Hola el mundo!"
    val base = 3


    val encrypted = original.encrypt(base)
    println("Зашифровано: $encrypted") // Пример: Khoor/#Zruog$

    // Расшифровка
    val decrypted = encrypted.decrypt(base)
    println("Расшифровано: $decrypted") // Пример: Hello, World!

    println(original == decrypted)
}