package com.sergei.kotlincourse.lesson25.homework

//Задание 3. Создай функцию, которая принимает список строк и число, а возвращает список из строк,
//длина которых больше или равна заданному числу. Если список пуст, нужно выкинуть исключение.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

//обычная функция
fun forTres (list: List<String>, number: Int): List<String> {
    require(list.isNotEmpty()) {"Список не должен быть пустым"}
    return list.filter { it.length >= number }
    }

//аналогичная анонимная функция
val forTres1 = fun (list: List<String>, number: Int): List<String> {
    require(list.isNotEmpty()) {"Список не должен быть пустым"}
    return list.filter { it.length >= number}
}

//лямбда выражение с указанием типа
val forTres2: (List<String>, Int) -> List<String> = {list, number ->
    require(list.isNotEmpty()) {"Список не должен быть пустым"}
    list.filter { it.length >= number}
}

//лямбда выражение без указания типа
val forTres3 = {list: List<String>, number: Int ->
    require(list.isNotEmpty()) {"Список не должен быть пустым"}
    list.filter { it.length >= number }
}


fun main() {
    val listForTres = listOf<String>("uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez")
    val listForTres1 = listOf<String>()


    println(forTres3(listForTres, 5))//проверка, что лямбда выражение работает правильно
    println(forTres3(listForTres, 9))//проверка, что лямбда выражение работает правильно c другим номером
    println(forTres3(listForTres1, 9))//проверка, что лямбда выражение работает правильно с пустым списком


}