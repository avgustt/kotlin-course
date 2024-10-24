package com.sergei.kotlincourse.lesson15.homework

class Party ( var location: String, var attendees: Int) {
    fun details () {
        println("место проведение Party - ${location} и гостей будет ${attendees}")
    }
}