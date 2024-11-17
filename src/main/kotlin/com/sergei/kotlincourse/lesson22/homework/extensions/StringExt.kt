package com.sergei.kotlincourse.lesson22.homework.extensions

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

//Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через ответы
//(но мы то знаем что слово только одно, но не будем его называть). Напиши метод расширения строки, который будет
//принимать список имён пользователей и выводить в консоли эту строку побуквенно в столбик: имя автора и букву под ним.
//Если сможешь повторить оригинальный шаблон вывода ответов с помощью похожих ASCII символов, будет очень круто.
//Вот ссылка на референс:
//https://x.com/SadNSober_/status/1370280031616897026

fun String.toPidmarkoz(authors: List<String>) {
    val charList = this.toList()
    val maxAuthorLength = authors.maxOfOrNull { it.length } ?: 0

    charList.forEachIndexed { index, char ->
        val author = authors.getOrNull(index % authors.size) ?: "unknown"

        val line = "| ${author.padEnd(maxAuthorLength)} | $char |"
        println(line)
    }

    println("+${"-".repeat(maxAuthorLength + 4)}+---+")
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

//пидмаркоз

    val text = "пидмаркоз"
    val authors = listOf("sadnsober_", "user123", "anon")
    text.toPidmarkoz(authors)
}