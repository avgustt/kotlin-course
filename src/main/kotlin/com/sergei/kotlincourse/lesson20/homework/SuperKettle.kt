package com.sergei.kotlincourse.lesson20.homework

class SuperKettle(maxTemperature: Int) : TemperatureControlledDevice(maxTemperature) {
    fun boil() {
        if (!isPoweredOn) {
            println("Ничего не греется, нужно к сети подключить")
            return
        }
        println("Пашем как проклятые, скоро будет - $currentTemperature°C.")
    }

    override fun operate() {
        TODO("Not yet implemented")
    }
}