package com.sergei.kotlincourse.lesson8

fun main () {

    println(text1Convert(text1))
    println(text2Convert(text2))
    println(text3Convert(text3))
    println(text4Convert(text4))
    println(text5Convert(text5))
    dateTime() // Задание 1
    creditCart() // Задание 2
    chancheEmail() // Задание 3
    faleNames () // Задание 4
    companyName () // Задание 5

}

//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".

var text1 = "Это невозможно выполнить за один день"

fun text1Convert (inputText1: String): String {
    return when {
        inputText1.contains("невозможно выполнить за один день") ->
            inputText1.replace("невозможно выполнить за один день","совершенно точно возможно, просто требует времени")
        else -> ""
    }
}

//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".

var text2 = "Я не уверен в успехе этого проекта"

fun text2Convert (inputText2: String): String {
    return when {
        inputText2.startsWith("Я не уверен в успехе этого проекта") ->
        { "$text2 ... ,но моя интуиция говорит об обратном"}
        else -> ""
    }
}

//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".

var text3 = "Произошла катастрофа на сервере"

fun text3Convert (inputText3: String): String {
    return inputText3.replace("катастрофа", "интересное событие")
}

//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".

var text4 = "Этот код работает без проблем"

fun text4Convert (inputText4: String): String {
    return when {
        inputText4.endsWith("без проблем") ->
            inputText4.replace("без проблем", "с парой интересных вызовов на пути")
        else -> ""
    }
}

//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

var text5 = "Удача"

fun text5Convert (inputText5: String): String {
    return when {
        inputText5.endsWith(" ") -> ""
        else -> "Иногда $inputText5, но не всегда"
    }
}

//Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
//Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

fun dateTime () {
    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val parts = log.split(" ")
    val date = parts[5]
    val time = parts[6]

    println(date)
    println(time)

}

//Задание 2: Маскирование Личных Данных
//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
// Замаскируйте все цифры, кроме последних четырех, символами "*".

fun creditCart () {
    val nombers = "4539 1488 0343 6467"
    val parts = nombers.split(" ")
    val secret = parts[3]
    println("****-****-****-${secret}")
}

//Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//Описание: У вас есть электронный адрес "username@example.com".
// Преобразуйте его в строку "username [at] example [dot] com".

fun chancheEmail () {
    val email = "username@example.com"
    val parts = email.replace("@", " [at] ")
    val parts1 = parts.replace(".", " [dot] ")
    println(parts1)
}

//Задание 4: Извлечение Имени Файла из Пути
//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.

fun faleNames () {
    val way = "C:/Пользователи/Документы/report.txt"
    val parts = way.split("/")
    val nexStep = parts[3].split(".")
    println(nexStep[0])
}

//Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения.
// Используй for для перебора слов. Используй var переменную для накопления первых букв.
//Описание: У вас есть фраза, например "Объектно-ориентированное программирование".
// Создайте аббревиатуру из начальных букв слов (например, "ООП").

fun companyName() {

    var ups = "Объектно-ориентированное программирование"
    var ips = ups.split("-", " ")
    var abbreva = ""
    for (ops in ips) {
        if (ops.isNotEmpty()) {
            abbreva += ops[0].uppercase()
        }
    }
    println(abbreva)
}