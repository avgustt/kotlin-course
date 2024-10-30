package com.sergei.kotlincourse.lesson17.homework.geometricFigure

class Quadrilateral(
    square: Int,
    corners: Int,
    val isosceles: Boolean
): Polygon(square, corners) {
}