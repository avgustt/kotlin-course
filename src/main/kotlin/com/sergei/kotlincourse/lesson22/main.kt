package com.sergei.kotlincourse.lesson22

fun String.removeSpaces(): String {
    return replace(" ", "")
}

fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}



fun String.funA(arg1: String, arg2: Int): Boolean {
    return true
}

fun List<Int>.funB(arg1: String?) {

}

fun <KEY,VAL> Map<KEY,VAL>.funC(arg1: KEY, arg2: VAL): Boolean {
    return true
}

fun Double?.funD(arg1: Double, arg2: String?): Double {
    return 0.0
}

fun <T> Set<T>.funE(arg1: T): List<T> {
    return listOf()
}

fun main() {
    val result = "String with spaces".removeSpaces()
    println(result)

    val s: List<Int?> = listOf(1, null)
    s.isElementsNullOrEmpty()

    println(   "sdsfd".funA("sdfsdf", 1)  )
    listOf(1,2,).funB(null)
    val  num: Map<String, Int> = mapOf("sadfsd" to 1, "gfhf" to 2)
    num.funC<String,Any>("dfs", true)



    fun Double.format(): String {
        return "%,.2f".format(this)
    }

    fun String.wordCounter(): Int {
        return split(" ").size
    }

    fun <T> T.createList(n: Int): List<T> {
        return (0 until n).map {
            println("it: $it")
            println("this: $this")
            this
        }
    }


        var num = 58.12345
        println("%,.2f".format(num))
        println(num.format())

        var str = "aaa bbb ccc ddd"
        println(str.split(" ").size)
        println(str.wordCounter())

        var num2 = "aaa"
        val list = listOf(num2)
        val list3 = listOf(num2, num2, num2)
        println(num2.createList(8))
}

