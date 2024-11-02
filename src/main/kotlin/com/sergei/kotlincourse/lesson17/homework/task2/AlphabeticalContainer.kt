package com.sergei.kotlincourse.lesson17.homework.task2
//Третий класс должен добавлять элементы в список в алфавитном порядке. Если мы добавляем новый элемент в список,
// то он должен встать где-то между другими элементами и занять место в соответствии с сортировкой по алфавиту.

class AlphabeticalContainer: Materials() {
    fun addMaterialInAlphabeticalOrder(material: String) {
        val addMaterial = extractMaterial().toMutableList()
        addMaterial.add(material)
        addMaterial.sort()
        addMaterial.forEach{addMaterial(it)}
    }
}