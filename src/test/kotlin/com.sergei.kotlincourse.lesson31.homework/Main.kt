package com.sergei.kotlincourse.lesson31.homework

//2.1. Тесты для addCereal



fun addCereal(cereal: Cereal, amount: Float): Float {
    require(amount >= 0) {
        "Количество крупы не может быть отрицательным"
    }
    checkStorageCapacity(cereal)
    val currentAmount = storage.getOrDefault(cereal, 0f)
    val amountForAdding = minOf(getSpace(cereal), amount)
    storage[cereal] = currentAmount + amountForAdding
    return amount - amountForAdding
}