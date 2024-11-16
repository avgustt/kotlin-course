package com.sergei.kotlincourse.lesson22.homework.fifthTask

//Задача 6: Собери пидмаркоз!
//
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
    val text = "пидмаркоз"
    val authors = listOf("sadnsober_", "user123", "anon")
    text.toPidmarkoz(authors)
}