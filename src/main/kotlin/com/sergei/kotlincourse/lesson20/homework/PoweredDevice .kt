package com.sergei.kotlincourse.lesson20.homework

abstract class PoweredDevice : Powerable {

    override fun powerOn() {
        println("${this::class.simpleName} is now powered on.")
    }

    override fun powerOff() {
        println("${this::class.simpleName} is now powered off.")
    }

    abstract fun operate()
}