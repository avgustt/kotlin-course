package com.sergei.kotlincourse.lesson21.homework

//Напишите класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления и получения всех элементов.

class ListHolder<T>(){

private var listForListHolder: MutableList<T> = mutableListOf()

    fun addListHolder(element: T) {
        listForListHolder.add(element)
    }

    fun getAllElements(): List<T> {
        return listForListHolder.toList()
    }
}
