package com.sergei.kotlincourse.lesson17.homework.task2

class AlphabeticalContainer: Materials() {
    fun addMaterialInAlphabeticalOrder(material: String) {
        materials.add(material) // Добавляем новый элемент
        materials.sort() // Сортируем весь список после добавления
    }
}