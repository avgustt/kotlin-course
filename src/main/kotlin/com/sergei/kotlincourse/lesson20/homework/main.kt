package com.sergei.kotlincourse.lesson20.homework

fun main() {

    // Создаем холодильник
    val SuperFridge = SuperFridge(maxTemperature = 5)
    SuperFridge.setTemperature(3)        // Проверка на питание
    SuperFridge.powerOn()                // Включаем холодильник
    SuperFridge.setTemperature(3)        // Устанавливаем температуру
    SuperFridge.open()                   // Открываем холодильник
    SuperFridge.cool()                   // Запускаем охлаждение
    SuperFridge.close()                  // Закрываем холодильник
    SuperFridge.powerOff()               // Выключаем холодильник

    println("\n")

}