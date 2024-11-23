package com.sergei.kotlincourse.lesson24

fun main() {
    try {
        val t = null
        t!!
        val r = listOf(1)
        r[2]
    } catch (e: NullPointerException) {
        println("NullPoinerExeption")
    } catch (e: RuntimeException) {
        println("ArrayIndexOutOfBounds")
    } finally {
        println("finally")
    }




}