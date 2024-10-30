package com.sergei.kotlincourse.lesson17.homework.educational

class ChurchSchoolForMen (
    type: String,
    number: Int,
    blessed: Boolean,
    val bell: Boolean
): ChurchSchool (type, number, blessed) {}