package com.sergei.kotlincourse.lesson17.homework.task2

class KeyValueContainer: Materials() {
    fun addKeyValuePairs(pairs: Map<String, String>) {
        pairs.forEach { (key, value) ->
            materials.add(0, key) // Ключ добавляем в начало
            materials.add(value)  // Значение добавляем в конец
        }
    }
}