package com.sergei.kotlincourse.lesson20.homework

abstract class ProgrammableDevice : PoweredDevice(), Programmable {

    private val actionQueue = mutableListOf<String>()


    override fun programAction(action: String) {
        actionQueue.add(action)
        println("$action - добавлено")
    }


    override fun execute() {
        println("Executing programmed")
        actionQueue.forEach { it ->
            println("Выполнено: $it")
        }
        actionQueue.clear() // Очищаем и забываем
    }
}