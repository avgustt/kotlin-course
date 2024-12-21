package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson32

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SimpleTest {
    lateinit var list: MutableList<String>



    @BeforeEach
    fun setup(){
        list = mutableListOf("1", "2")
    }

    @Test
    fun forTest(){
        list.add("3")
        Assertions.assertEquals("3", list[1])

    }


}