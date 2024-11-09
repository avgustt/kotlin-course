package com.sergei.kotlincourse.lesson20.homework

class SuperOven(maxTemperature: Int) : TemperatureControlledDevice(maxTemperature) {
    fun bake() {
        if (!isPoweredOn) {
            println("Надо дать энергии")
            return
        }
        println("Жгу как не в себя, скоро будет - $currentTemperature°C.")
    }

    override fun operate() {
        TODO("Not yet implemented")
    }
}