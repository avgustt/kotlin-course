package com.sergei.kotlincourse.lesson20.homework

fun main() {


    val SuperFridge = SuperFridge(maxTemperature = 5)
    SuperFridge.setTemperature(3)
    SuperFridge.powerOn()
    SuperFridge.setTemperature(3)
    SuperFridge.open()
    SuperFridge.cool()
    SuperFridge.close()
    SuperFridge.powerOff()

    println("\n")

    val washingMachine = SuperWashingMachine(maxTemperature = 90)
    washingMachine.powerOn()
    washingMachine.setTemperature(60)
    washingMachine.startWashCycle()
    washingMachine.close()
    washingMachine.powerOff()

    println("\n")

    val kettle = SuperKettle(maxTemperature = 100)
    kettle.powerOn()
    kettle.setTemperature(90)
    kettle.boil()
    kettle.powerOff()

    println("\n")

    val oven = SuperOven(maxTemperature = 250)
    oven.powerOn()
    oven.setTemperature(180)
    oven.bake()
    oven.powerOff()
}