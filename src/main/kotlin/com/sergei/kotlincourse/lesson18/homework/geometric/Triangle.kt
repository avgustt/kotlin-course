package com.sergei.kotlincourse.lesson18.homework.geometric

import kotlin.math.sin

class Triangle (
    private val sideA: Double,
    private val sideB: Double,
    private val angleInDegrees: Double
): Shape() {
    override fun area(): Double {
        return 0.5 * sideA * sideB * sin(angleInDegrees)
    }
}