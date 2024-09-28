package com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson7

fun main() {
////Прямой Диапазон:
////Напишите цикл for, который выводит числа от 1 до 5:
//
//    for (itemFrom1To10 in 1..5) {
//        println(itemFrom1To10)
//    }
//
////Напишите цикл for, который выводит четные числа от 1 до 10:
//
//    for (itemFrom1To5 in 1..10) {
//        println(itemFrom1To5)
//    }
//

////Обратный Диапазон:
////Создайте цикл for, который выводит числа от 5 до 1.:
//    for (itemFrom5To1 in 5 downTo 1) {
//        println(itemFrom5To1)
//    }
//
////Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.:
//
//    for (itemFrom10To1 in 10 downTo 1) {
//        println(itemFrom10To1 - 2)
//    }

////С Шагом (step):
////Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.:
//
//    for (itemFrom1To9 in 1..9 step 2) {
//        println(itemFrom1To9)
//    }
//
////Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.:
//
//    for (itemFrom1To20 in 1..20 step 3) {
//        println(itemFrom1To20)
//    }

////Использование До (until):
////Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
//
//    for (itemUntilFrom1To9 in 1 until 9) {
//        println(itemUntilFrom1To9)
//    }
//
////Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.:
//
//    for (itemUntilFrom3To15 in 3 until 15) {
//        println(itemUntilFrom3To15)
//    }

////Цикл while:
////Создайте цикл while, который выводит квадраты чисел от 1 до 5.:

//    var conter = 1
//    while (conter <= 5) {
//        println(conter * conter)
//        conter++
//    }

////Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль:

//    var conterFrom10To5 = 10
//    while (conterFrom10To5 == 10){
//        println(conterFrom10To5 - 5)
//        conterFrom10To5++
//    }


////Цикл do...while:
////Используйте цикл do...while, чтобы вывести числа от 5 до 1.:

//    var doWhile = 1
//
//    do {
//        println("5, 4, 3, 2, 1")
//        doWhile--;
//    } while (doWhile == 2)

////Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.

//    var doWhile2 = 1
//
//    do {
//        println("счетчик меньше 10")
//        doWhile2++;
//    } while (doWhile2 < 10)

////Цикл while:
//
////Создайте цикл while, который выводит квадраты чисел от 1 до 5.:
//
//var rootFrom1To5 = 1
//while (rootFrom1To5 <= 5) {
//    println(rootFrom1To5 * rootFrom1To5)
//    rootFrom1To5++
//}

//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль

//    var whileFrom10To5 = 10
//while (whileFrom10To5 == 10) {
//    println(whileFrom10To5 - 5)
//    whileFrom10To5 = whileFrom10To5 - 5
//}

//Использование break:
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

//    for (breakFor6 in 1..10) {
//        if (breakFor6 == 6) break
//        println(breakFor6)
//    }

//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.

//var whileWithBreak = 1
//    while (whileWithBreak >= 0) {
//        if (whileWithBreak == 10) break
//        println (whileWithBreak++)
//    }

//Использование continue:
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.

//for (continueFor in 1..10) {
//    if (continueFor % 2 == 0) continue
//    println(continueFor)
//}

//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.

//var continueWhile = 0
//while (continueWhile++ < 10) {
//    if (continueWhile % 3 == 0) continue
//    println(continueWhile)
//}

//Задача на вложенный цикл
//Создать цикл в цикле, в каждом использовать диапазон от 1 до 10.
// В консоль вывести результат умножения переменных цикла.
// Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом,
// чтобы отделять значения в строку. После вложенного цикла выводить пустой println()
// чтобы следующий проход начинать с новой строки. Результат должен быть как на картинке.

//for (forOnFor1 in 1..10) {
//    for (forOnFor2 in 1..10) {
//        print(forOnFor1 * forOnFor2)
//        print(" ")
//    }
//    println()
//}
}
