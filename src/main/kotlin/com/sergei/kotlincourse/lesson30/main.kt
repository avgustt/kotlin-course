package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson30

object NumsObject {

    const val ONE = "ONE"
    const val TWO = "TWO"
    const val THREE = "THREE"
}

fun main() {
println(NumsObject.THREE)
}

enum class Nums {
    ONE,
    TWO,
    THREE





}

fun printNum(num: Nums) {
    when(num) {
        Nums.ONE -> println(1)
        Nums.THREE -> println(2)
        Nums.TWO -> println(3)

    }
}

enum class DayOfWeek(val isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    fun printDayType() {
        if(isWeekend) println("$name is a weekend")
        else println("$name is a weekday")
    }
}

enum class CoffeeType(
    val cost: Double,
    val coffeeBase: String,
    val recommendedSugar: Int,
    val hasMilk: Boolean = false
) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0);

    fun description() = "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}

