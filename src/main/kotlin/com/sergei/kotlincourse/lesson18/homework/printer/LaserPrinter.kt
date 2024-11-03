package com.sergei.kotlincourse.lesson18.homework.printer

class LaserPrinter : Printer() {
    override fun print(text: String) {
        splitAndPrint(text) { word ->
            println("${Background.WHITE}${Colors.BLACK}$word${Colors.RESET}${Background.RESET}")
        }
    }
}