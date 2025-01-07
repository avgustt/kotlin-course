package com.sergei.kotlincourse.lesson32

import org.junit.jupiter.api.Assertions
import kotlin.test.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

fun calculateDiscountedPrice(originalPrice: Double, discountPercentage: Int): Double {
    require(originalPrice >= 0) { "Цена должна быть неотрицательной" }
    require(discountPercentage in 0..100) { "Скидка должна быть от 0 до 100%" }

    return originalPrice * (1 - discountPercentage / 100.0)
}

//    @Test
//    fun `convertTo`(){
//    val actual = textTpPhone( "892321145")
//    Assertions.assertEquals(textTpPhone(), "textTpPhone")
//}