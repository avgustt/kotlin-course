package com.sergei.kotlincourse.lesson15.homework

import java.sql.Time

object Moon{

    private var isVisible: Boolean = true
    private var phase: String = "New Moon"

    fun showPhase () {
            if (isVisible) {
                println("сейчас луна в стадии ${phase}")
            }
            else {
                println("луну не видно")
            }
        }
    }



