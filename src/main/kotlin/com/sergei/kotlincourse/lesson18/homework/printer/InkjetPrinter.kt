package com.sergei.kotlincourse.lesson18.homework.printer

class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        Colors.RED to Background.GREEN,
        Colors.YELLOW to Background.BLUE,
        Colors.CYAN to Background.PURPLE,
        Colors.WHITE to Background.RED

    )

    override fun print(text: String) {
        var colorIndex = 0
        splitAndPrint(text) { word ->
            val (textColor, bgColor) = colorPairs[colorIndex]
            println("$bgColor$textColor$word${Colors.RESET}${Background.RESET}")
            colorIndex = (colorIndex + 1) % colorPairs.size
        }
    }
}