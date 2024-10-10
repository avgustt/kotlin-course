package com.sergei.kotlincourse.lesson11

fun main() {
    val  pair: Pair <Int, String> = 1 to "a"
    val pair2 = Pair(2, "a")

        println(pair.first)
        println(pair.second)

val a1 = "Франция" to "Париж"
    println(a1)

    val capitals = mapOf(
        "Росcосия" to "Москостан"

    )
    val emptyMap: Map<String, String> = mapOf<String, String>()
    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")


    val capitalOfRussia = capitals["Россия"]

    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Франция")

    for (entries in mutableCapitals) {
        println("${entries.key} : ${entries.value}")
    }


    for ((country, capital) in capitals) {
        println("$country: $capital")
    }

    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)


}

