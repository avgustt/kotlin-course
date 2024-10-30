package com.sergei.kotlincourse.lesson5

fun main() {
    PrintAtmosphericPressure(atmosphericPressure = 740)
    PrintAtmosphericPressure(atmosphericPressure = null)

}


fun PrintAtmosphericPressure(atmosphericPressure: Any?) {
    val atmosphericPressure = (atmosphericPressure ?: "Error")
      println(atmosphericPressure)
}





//Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
//которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
//Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.


//(12 / 3 > 3) && (5 * 2 == 10) пример решения: true && true = true
//(14 - 4 <= 10) || (6 / 2 != 3) решение: true || true = true
//(9 + 1 == 10) && (8 % 2 == 0) решение: true && true = true
//(7 - 2 < 5) || (4 * 3 != 12) решение: false || true = false
//(18 / 6 >= 3) && (5 + 5 == 10) решение: true && true = true
//(11 % 3 != 2) || (9 - 3 == 6) решение: false || true = true
//(5 * 2 < 11) && (14 / 2 == 7) решение: true && true = true
//(8 + 2 <= 10) || (7 % 2 != 1) решение: true || false = true
//(16 / 4 > 3) && (3 + 4 == 7) решение: true && true = true
//(10 % 2 == 0) || (5 - 3 != 1) решение: true || true = true



//((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1) решение: true && false || false = false
//((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7) решение: true && true || true = true
//((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0) решение: true && true || false = true
//((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8) решение: false && false || true = true
//((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6) решение: true || false && false = true


//(var f = 6; --f >= 5) || ((3 * 2 == 6) && (9 - 4 != 5)) решение: true || (true && false) = true
//((var g = 0; g++ != 0) && (4 + 2 == 6)) || (5 / 1 == 5) решение: (false && true) || true = true
//(var h = 7; h-- > 6) || (8 + 1 == 9) && (3 % 2 != 1) решение: true || true && false = true
//((var i = 5; i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5) решение: (true || false) && true = true
//(var j = 4; j-- < 4) && ((6 + 0 == 6) || (5 % 2 != 1)) решение: false && (true || false) = false