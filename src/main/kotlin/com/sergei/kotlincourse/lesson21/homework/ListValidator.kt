package com.sergei.kotlincourse.lesson21.homework

//Создай класс ListValidator
//с дженериком, ограниченным типом Number
//имплементируй интерфейс Validator
//типизированный по типу List с nullable типом дженерика класса
//Реализуй проверку:
//что ни один элемент списка не является null
//Ни один элемент приведённый к типу Double не равен 0.0

class ListValidator<T : Number> : Validator<List<T?>> {
    override fun validate(value: List<T?>): Boolean {
        return value.all { it != null && it.toDouble() != 0.0 }
    }
}