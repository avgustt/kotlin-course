package com.sergei.kotlincourse.lesson17.homework.task2
//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
class AddToBottom : Materials() {

    fun addMaterialToBottom(material: String) {
        val extracted = extractMaterial().toMutableList()
        extracted.add(0,material)
        extracted.forEach { addMaterial(it) }


    }
}