package com.sergei.kotlincourse.lesson20.homework

class SuperWashingMachine(maxTemperature: Int) : TemperatureControlledDevice(maxTemperature) {
    fun startWashCycle() {
        if (!isPoweredOn) {
            println("Нужно подключить")
            return
        }
        println("Мы начали работу и греемся до $currentTemperature°C.")
    }

    override fun operate() {
        TODO("Not yet implemented")
    }
}