package com.sergei.kotlincourse.lesson17.homework.educational

open class ChurchSchool(
    type: String,
    number: Int,
    val blessed: Boolean
): School(type, number) {}