package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson10

fun main() {

    //array - постоянной длины, изменяемый
    //list - постоянной длины, неизменяемый
    //mutableList - переменной длины, изменяемый
    //верно?


//    val numbers: Array<Int> = arrayOf(1,2,3,4,5)
//    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)
//
//    val emptyArray = Array(5) { "" }
//    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)
//
//    val readOnList: List<String> = listOf("a", "b", "c")
//
//    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
//
//
//    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5) //множества
//
//    val mutableNumberSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
//
//
//    val set = setOf("K", "o", "t", "l", "i", "n")
//
////    for (letter in set) {
////        println("| $letter |")
////    }
//
//    val list = listOf(32, 53,1, -76)
//    for (index in list.indices) {
//        if (index == list.lastIndex) {
//            println(list[index] + list[0])
//        } else {
//            println(list[index] + list[index + 1])
//        }
//    }
//
//    var index = list.lastIndex
//    while (index >= 0) {
//        println("`${list[index--]}`")
//    }
////
//    val arrey = Array(100) { 0 }
//
//    val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
//
//    val array1 = Array (10) { 0 }
//    array1[0] = 10
//    for (i in array1.indices){
//        array1[i] = (i + 1) * 10
//    }
//    println(array1.toList())
//
//
//    var array2 = arrayOf("a", "b", "c", "d", "f")
//    for (i in array2.indices){
//        array2[i] = " "
//    }
//println(array2.toList())
//
//    var array3 = arrayOf(1, 2, 3)
//    var array4 = arrayOf(5, 6, 4)
//    val emptyArray = Array(3) { 0 }
//
//    for (i in emptyArray.indices){
//        emptyArray[i] = array4[i] + array3[i]
//    }
//
//println(emptyArray.toList())

    val list1 = listOf<Int>()

val list2 = listOf("asd", "dqe", "dfv")
//println(list1.toList())
//    println(list2.toList())



//val mutableList1 = mutableListOf<Float>()
//
//
//    mutableList1.add(45F)
//    mutableList1.add(45F)
//    mutableList1.removeAt(1)
////    println(mutableList1.toList())
//
//
//
//for (i in list2) {
//    println(i)
//}


val  emplySet = setOf<Any>()

val setNum = setOf(1, 2, 3, 4, 5)
val setNum2 = mutableSetOf(1, 2, 3)
setNum2.add(6)
setNum2.remove(2)
    println(setNum2)

    val setNum3 = mutableSetOf<Int>()


}

}

