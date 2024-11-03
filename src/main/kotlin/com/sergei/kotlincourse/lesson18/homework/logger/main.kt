package com.sergei.kotlincourse.lesson18.homework.logger

fun main() {

        val logger = ConsoleLogger()

        // простое сообщение уровня INFO
        logger.log("This is a general information message.")

        // сообщение с уровнем WARNING
        logger.log("WARNING", "This is a warning message.")

        // сообщение с уровнем ERROR
        logger.log("ERROR", "This is an error message.")

        // список сообщений уровня INFO
        val messages = listOf("First info message", "Second info message", "Third info message")
        logger.log(messages)

        // исключение
        val exception = Exception("This is an exception message")
        logger.log(exception)
    }
