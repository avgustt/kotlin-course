package com.sergei.kotlincourse.lesson22.homework.fifthTask

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