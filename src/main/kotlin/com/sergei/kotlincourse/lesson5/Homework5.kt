package com.sergei.kotlincourse.lesson5

//Контекст: Вы изучаете физическое явление затухания звука в помещении.
// У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования данные
// о коэффициенте затухания иногда могут быть неизвестны.
//Задача: Рассчитать предполагаемую интенсивность звука после затухания.
// Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания.
// Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.
//
//Решение задачи 1:

fun main() {
    printAttenuation(100.0, null)
    printAttenuation(100.0, 0.4)
}

fun printAttenuation(soundIntensity: Double, koef: Double?) {
    val attenuation = (soundIntensity * (koef ?: 0.5))
    println(attenuation)
}

//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
//которая составляет 0,5% от его стоимости. В случае, если стоимость не указана,
//то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.

//Решение задачи 2:

fun main() {
    PrintCargoCost(cargo = null)
    PrintCargoCost(cargo = 60.0)
}

fun PrintCargoCost(insurance: Double = 0.5, cargo: Double?) {
    val cost = (((insurance / 100.0) * (cargo ?: 50.0)) + (cargo ?: 50.0))
    println(cost)
}

//Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
//которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
//Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.
//
//Решение задачи 3:

fun main() {
    PrintAtmosphericPressure(atmosphericPressure = 740)
    PrintAtmosphericPressure(atmosphericPressure = null)
}

fun PrintAtmosphericPressure(atmosphericPressure: Any?) {
    val atmosphericPressure = (atmosphericPressure ?: "Error")
    println(atmosphericPressure)
}