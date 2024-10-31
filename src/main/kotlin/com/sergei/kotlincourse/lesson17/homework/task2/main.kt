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
//
//Создай подклассы этого контейнера, которые будут добавлять строку material в какое-то определённое место.
//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными,
// которые уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.
//Третий класс должен добавлять элементы в список в алфавитном порядке. Если мы добавляем новый элемент в список,
// то он должен встать где-то между другими элементами и занять место в соответствии с сортировкой по алфавиту.
//Четвёртый класс должен принимать словарь из строк (ключи и значения). Каждая пара ключа и значения должна
//попадать в контейнер следующим образом - ключ в начало, значение в конец.

//метод на добавление:

    val AddToBottom = AddToBottom()
    AddToBottom.addMaterialToBottom("zero")
    AddToBottom.addMaterialToBottom("zero+1")
    AddToBottom.printContainer()

//

    val alternatingContainer = AlternatingContainer()
    alternatingContainer.addMaterialsAlternating(ordinalNumbers)
    alternatingContainer.printContainer()

//

    val alphabeticalContainer = AlphabeticalContainer()
    alphabeticalContainer.addMaterialInAlphabeticalOrder("Orange")
    alphabeticalContainer.addMaterialInAlphabeticalOrder("Apple")
    alphabeticalContainer.addMaterialInAlphabeticalOrder("Banana")
    alphabeticalContainer.printContainer()

//
    val keyValueContainer = KeyValueContainer()
    keyValueContainer.addKeyValuePairs(mapOf("Key1" to "Value1", "Key2" to "Value2"))
    keyValueContainer.printContainer()

}