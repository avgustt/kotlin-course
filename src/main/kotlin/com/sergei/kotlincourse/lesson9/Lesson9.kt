package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson9

var nameAndBerthDay = "02.октября Александр"

fun main() {

    val result = checkName(nameAndBerthDay)
    println(result)
}

fun checkName(input: String): String {
    val parts = input.split(" ")

    val berthDay = parts[0]
    val name = parts[1]


    return if (name == "Александр" && berthDay == "02.октября") {
        "Привет тебе Саша! С днем рождения!"
    } else if (name == "Александр" && berthDay != "02.октября") {
        "Привет тебе Саша! Впереди тебя ждет множество праздников"
    } else {
        "Привет тебе человек"
    }
}


