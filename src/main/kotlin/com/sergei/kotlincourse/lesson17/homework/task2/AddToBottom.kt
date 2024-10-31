package com.sergei.kotlincourse.lesson17.homework.task2

class AddToBottom : Materials() {
    fun addMaterialToBottom(material: String) {
        materials.add(0, material) // Добавляем материал в начало
    }
}