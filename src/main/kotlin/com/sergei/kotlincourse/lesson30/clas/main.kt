package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson30.clas

enum class Seasons(val firstMonthName: String, val isValatileDuration: Boolean = false) {
    WINTER(firstMonthName = "December", true),
    SPRING(firstMonthName = "March"),
    SUMMER(firstMonthName = "june"),
    AUTUMN(firstMonthName = "september"),
    ;


    fun printInfo() {
        println("B $this первый месяц $firstMonthName сезон ${ if (isValatileDuration) "с изменяемой " else "не изменяемой"} продолжительностью" )
    }

    companion object{
        fun detectSeason(firstMonthName1: String):Seasons{
            return Seasons.entries.filter { it.firstMonthName == firstMonthName1 }.firstOrNull()?: throw IllegalArgumentException()
        }
    }
}

interface HasValue {
    val value: String
}

interface HasAction {
    fun action()
}

enum class HomeDevices(
    override val value: String
): HasValue, HasAction {
    FRIDGE("Холодильник") {
        override fun action() {
            println("быр быр быр")
        }
    },
    WASHER("Стиралка") {
        override fun action() {
            println("врум врум врум")
        }
    },
    TV("Телик") {
        override fun action() {
            println("шшшш шшшш шшшш")
        }
    }
    ;
}



fun main() {
//    Seasons.SUMMER.printInfo()
//    Seasons.WINTER.printInfo()
//
//    println(Seasons.detectSeason("December"))
//    println(Seasons.detectSeason("august"))

    HomeDevices.FRIDGE.action()
    HomeDevices.WASHER.action()
    HomeDevices.TV.action()
}