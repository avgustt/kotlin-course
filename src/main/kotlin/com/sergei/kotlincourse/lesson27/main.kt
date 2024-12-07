package com.sergei.kotlincourse.lesson27

import kotlin.io.use as use1

fun main() {
    val list = mutableListOf(1, 2, 3)

    println(list.size)
    list.add(3)
    println(list.size)

    with(list) {
        println(size)
        add(4)
        println(size)
    }

    list.add(5)
    val result = list.sum()

    val result1 = list.run {
        add(5)
        sum()
    }

//    val s = File("example.txt").inputStream()
//    val content = s.readBytes()
//    println(content)
//    s.close()
//
//    File("example.txt").inputStream().use {
//        val content = it.readBytes()
//        println(content.size)
//    }

    val list2 = mutableListOf<Int>().apply {
        add(1)
        add(2)
    }

    val str: String? = "Hello"
    str?.let {
        println(it.length)  // Выполняется только если str не null
    }




}

}
