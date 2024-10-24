package com.sergei.kotlincourse.lesson15.homework

class Emotion(
    var type: String,
    var intensity: Int
    ) {
    fun express() {
        val message = when (intensity) {
             in 1..30 -> "У вас ${type} легкого уровня"
             in 31..60 -> "У вас ${type} среднего уровня"
             in 61..70 -> "У вас ${type} сильного уровня"
             in 71..100 -> "У вас ${type} ярко выраженное"
             else -> "Дед иди пить таблетки!"
        }
        println(message)
    }
}