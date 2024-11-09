package com.sergei.kotlincourse.lesson20.homework

abstract class ProgrammableDevice : PoweredDevice(), Programmable {

    private val actionQueue = mutableListOf<String>()

    // Добавляем программу
    override fun programAction(action: String) {
        actionQueue.add(action)
        println("$action - добавлено")
    }

    // Выполняем метод execute
    override fun execute() {
        println("Executing programmed")
        actionQueue.forEach { it ->
            println("Выполнено: $it")
        }
        actionQueue.clear() // Очищаем и забываем
    }
}