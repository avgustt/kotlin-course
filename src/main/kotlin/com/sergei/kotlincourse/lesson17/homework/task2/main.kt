package com.sergei.kotlincourse.lesson17.homework.task2



fun main () {

    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

//Это класс контейнера. Он абстрактный, это означает, что нельзя создавать экземлпяр этого класса,
//он нужен только для того, чтобы быть основой для подклассов.


//Четвёртый класс должен принимать словарь из строк (ключи и значения). Каждая пара ключа и значения должна
//попадать в контейнер следующим образом - ключ в начало, значение в конец.

//Создай подклассы этого контейнера, которые будут добавлять строку material в какое-то определённое место.
//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0):
    val mutableOrdinalNumbers = ordinalNumbers.toMutableList()
    val addToBottom = AddToBottom()
    mutableOrdinalNumbers.forEach { addToBottom.addMaterial(it) }
    addToBottom.addMaterialToBottom("zero")
    addToBottom.addMaterialToBottom("zero+1")
    addToBottom.printContainer()

//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными,
//которые уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.

    val alternatingContainer = AlternatingContainer()
    val newList = listOf(
        "один", "два", "три", "четыре", "пять",
        "шесть", "семь", "восемь", "девять", "десять",
        "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
        "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать")

    ordinalNumbers.forEach {alternatingContainer.addMaterial(it)}
    alternatingContainer.addMaterialsAlternating(newList)
    alternatingContainer.printContainer()

//Третий класс должен добавлять элементы в список в алфавитном порядке. Если мы добавляем новый элемент в список,
// то он должен встать где-то между другими элементами и занять место в соответствии с сортировкой по алфавиту.

    val alphabeticalContainer = AlphabeticalContainer()
    ordinalNumbers.forEach{alphabeticalContainer.addMaterial(it)}
    alphabeticalContainer.addMaterialInAlphabeticalOrder("Orange")
    alphabeticalContainer.addMaterialInAlphabeticalOrder("Apple")
    alphabeticalContainer.addMaterialInAlphabeticalOrder("Banana")
    alphabeticalContainer.printContainer()


//Четвёртый класс должен принимать словарь из строк (ключи и значения). Каждая пара ключа и значения должна
//попадать в контейнер следующим образом - ключ в начало, значение в конец.

    val keyValueContainer = KeyValueContainer()
    ordinalNumbers.forEach{keyValueContainer.addMaterial(it)}
    keyValueContainer.addKeyValuePairs(mapOf("Key1" to "Value1", "Key2" to "Value2"))
    keyValueContainer.printContainer()

}