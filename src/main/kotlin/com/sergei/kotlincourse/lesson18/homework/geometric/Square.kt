package com.sergei.kotlincourse.lesson18.homework.geometric

class Square (
    private val side: Double
): Shape () {
    override fun area(): Double {
        return side * side
    }
}
