package com.sergei.kotlincourse.lesson18.homework.logger

class ConsoleLogger : Logger() {

    override fun log(message: String) {
        println("${Colors.DEFAULT}[INFO] $message${Colors.RESET}")
    }


    fun log(level: String, message: String) {
        when (level) {
            "WARNING" -> println("${Colors.YELLOW}[WARNING] $message${Colors.RESET}")
            "ERROR" -> println("${Background.RED}${Colors.WHITE}[ERROR] $message${Background.RESET}${Colors.RESET}")
            else -> log(message) // По умолчанию — INFO
        }
    }


    fun log(messages: List<String>) {
        messages.forEach { log(it) }
    }


    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "An exception occurred")
    }
}