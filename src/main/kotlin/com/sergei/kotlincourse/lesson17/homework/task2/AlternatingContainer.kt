package com.sergei.kotlincourse.lesson17.homework.task2

class AlternatingContainer : Materials() {
    fun addMaterialsAlternating(newMaterials: List<String>) {
        var index = 0 // Начальный индекс для вставки
        newMaterials.forEach { it ->
            addMaterialAt(it, index) // Используем addMaterialAt для вставки
            index += 2 // Увеличиваем индекс для чередования
        }
    }
}