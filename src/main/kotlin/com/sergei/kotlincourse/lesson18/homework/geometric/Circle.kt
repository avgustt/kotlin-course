package com.sergei.kotlincourse.lesson18.homework.geometric

class Circle (
    private val radius: Double
) : Shape () {
    override fun area (): Double {
        return 3.14 * radius * radius
    }
}