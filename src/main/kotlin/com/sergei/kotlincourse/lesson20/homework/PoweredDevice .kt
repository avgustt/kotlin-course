package com.sergei.kotlincourse.lesson20.homework

abstract class PoweredDevice : Powerable {

    override fun powerOn() {
        println("Включено")
    }

    override fun powerOff() {
        println("Выключено")
    }

    abstract fun operate()
}