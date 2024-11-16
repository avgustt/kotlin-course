package com.sergei.kotlincourse.lesson21.homework

//Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
//Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.

class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun map(element: String) = element.split(" ")

//Добавь к интерфейсу Mapper ещё один метод, который будет преобразовывать список элементов типа T в список элементов
//типа R. Реализуй этот метод в классе PhrasesToListOfStrings с аналогичной механикой.

    override fun mapList(element: List<String>): List<List<String>> {
        return element.map { it.split(" ") }
    }
}