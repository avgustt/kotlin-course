package com.sergei.kotlincourse.lesson18.homework.printer

fun main() {
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    val text = "Отче наш, сущий на небесах! Да святится имя Твоё да приидет Царствие Твоё да будет воля Твоя и на земле, как на небе"

    println("Laser Printer:")
    laserPrinter.print(text)

    println("Inkjet Printer:")
    inkjetPrinter.print(text)
}