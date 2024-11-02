package com.sergei.kotlincourse.lesson17.homework.task2

//Четвёртый класс должен принимать словарь из строк (ключи и значения). Каждая пара ключа и значения должна
//попадать в контейнер следующим образом - ключ в начало, значение в конец.

class KeyValueContainer: Materials() {
    fun addKeyValuePairs(pairs: Map<String, String>) {
        val addMaterial = extractMaterial().toMutableList()
        pairs.forEach { (key, value) ->
            addMaterial.add(0, key)
            addMaterial.add(value)

        }
        addMaterial.forEach { addMaterial(it) }
    }
}