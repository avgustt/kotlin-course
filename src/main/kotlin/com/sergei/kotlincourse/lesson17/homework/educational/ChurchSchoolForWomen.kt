package com.sergei.kotlincourse.lesson17.homework.educational

class ChurchSchoolForWomen (
    type: String,
    number: Int,
    blessed: Boolean,
    val prayersForDay: Int
): ChurchSchool (type, number, blessed) {

    fun pray () {
        println("да приидет Царствие Твое")
    }
}