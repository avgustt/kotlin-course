package com.sergei.kotlincourse.lesson15.homework

class Concert(
    val group: String,
    val venue: String,
    val cost: Double,
    val hallСapacity: Int,
    private var ticketsSold: Int,
) {
    fun buyTicket () {
        ticketsSold = ++ticketsSold
        println("сейчас продано ${ticketsSold} билетов")
    }

    fun infoConcert () {
        println("концерт группы ${group} пройдет в ${venue} билет стоит ${cost} денег")
    }

}