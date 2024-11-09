package com.sergei.kotlincourse.lesson20.homework

fun main() {


    val SuperFridge = SuperFridge(maxTemperature = 5)
    SuperFridge.setTemperature(3)        // Проверка на питание
    SuperFridge.powerOn()                // Включаем холодильник
    SuperFridge.setTemperature(3)        // Устанавливаем температуру
    SuperFridge.open()                   // Открываем холодильник
    SuperFridge.cool()                   // Запускаем охлаждение
    SuperFridge.close()                  // Закрываем холодильник
    SuperFridge.powerOff()               // Выключаем холодильник

    println("\n")

    val washingMachine = SuperWashingMachine(maxTemperature = 90)
    washingMachine.powerOn()        // Включаем стиральную машину
    washingMachine.setTemperature(60) // Устанавливаем температуру
    washingMachine.startWashCycle()  // Запускаем цикл стирки
    washingMachine.close()           // Закрываем машину
    washingMachine.powerOff()        // Выключаем стиральную машину

    println("\n")

    val kettle = SuperKettle(maxTemperature = 100)
    kettle.powerOn()                // Включаем чайник
    kettle.setTemperature(90)       // Устанавливаем температуру
    kettle.boil()                   // Кипятим воду
    kettle.powerOff()               // Выключаем чайник

    println("\n")

    val oven = SuperOven(maxTemperature = 250)
    oven.powerOn()                  // Включаем духовку
    oven.setTemperature(180)        // Устанавливаем температуру
    oven.bake()                     // Запускаем выпекание
    oven.powerOff()
}