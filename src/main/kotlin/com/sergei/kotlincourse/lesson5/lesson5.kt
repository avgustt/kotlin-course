package com.sergei.kotlincourse.lesson5

fun main() {
    PrintCargoCost(cargo = null)
    PrintCargoCost(cargo = 60.0)

}


fun PrintCargoCost(insurance: Double = 0.5, cargo: Double?) {
    val cost = (((insurance / 100.0) * (cargo ?: 50.0)) + (cargo ?: 50.0))
      println(cost)
}





//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
//которая составляет 0,5% от его стоимости. В случае, если стоимость не указана,
//то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.


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
