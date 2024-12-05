package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson26

fun main() {
    val increment = fun(a: Int): Int {
        return a + 1
    }

    val findIndex = fun(text: String, word: String, ignoreCase: Boolean): Int {
        return text.indexOf(word, 0, ignoreCase)
    }

}



val increment = fun (a: Int): Int {
    return a + 1
}

fun findIndex(text: String, word: String, ignoreCase: Boolean = false): Int {
    return text.indexOf(word, 0, ignoreCase)
}


fun increment(a: Int): Int {
    return a + 1
}

//val findIndex: (String, String, Boolean) -> Int = { text, word, ignoreCase ->
//    text.indexOf(word, 0, ignoreCase)
//}
//
//val findIndex = { text: String, word: String, ignoreCase: Boolean ->
//    text.indexOf(word, 0, ignoreCase)
//}


