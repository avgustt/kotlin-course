package com.sergei.kotlincourse.lesson20.homework

abstract class TemperatureControlledDevice(
    override val maxTemperature: Int
) : ProgrammableDevice(), TemperatureRegulatable, Openable {

    protected var currentTemperature: Int = 0 // Доступен в дочерних классах
    protected var isPoweredOn: Boolean = false  // Доступен в дочерних классах
    private var isOpen: Boolean = false

    override fun powerOn() {
        isPoweredOn = true
        println("Подключено")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("Выключено")
    }

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Ничего не работает, устройство не подключено")
            return
        }
        if (temp in 0..maxTemperature) {
            currentTemperature = temp
            println("Температура - $currentTemperature°C.")
        } else {
            println("Температура - $temp°C еще немного и буде - $maxTemperature°C.")
        }
    }

    override fun open() {
        if (!isPoweredOn) {
            println("Не могу открыть, нет сил")
            return
        }
        if (!isOpen) {
            isOpen = true
            println("Открыто.")
        } else {
            println("Уже открыто")
        }
    }

    override fun close() {
        if (isOpen) {
            isOpen = false
            println("Закрыто")
        } else {
            println("Уже закрыто")
        }
    }
}