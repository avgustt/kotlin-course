package ru.webrelab.kie.cerealstorage

import final1.CerealStorage

class CerealStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {

    /**
     * Блок инициализации класса.
     * Выполняется сразу при создании объекта
     */
    init {
        require(containerCapacity >= 0) {
            "Ёмкость контейнера не может быть отрицательной"
        }
        require(storageCapacity >= containerCapacity) {
            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера"
        }
    }

    private val storage = mutableMapOf<Cereal, Float>()
    private var currentStorageUsage = 0f

    override fun addCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество не может быть отрицательным" }

        // Проверяем, есть ли место в хранилище
        if (currentStorageUsage + containerCapacity > storageCapacity) {
            throw IllegalStateException("Недостаточно места для нового контейнера")
        }

        // Получаем текущее количество крупы в контейнере, если оно есть
        val currentAmount = storage.getOrDefault(cereal, 0f)

        // Вычисляем, сколько еще можно добавить в контейнер
        val remainingSpace = containerCapacity - currentAmount

        if (amount <= remainingSpace) {
            // Если все количество умещается в текущем контейнере
            storage[cereal] = currentAmount + amount
            return 0f
        } else {
            // Если часть не вмещается, добавляем в контейнер, и возвращаем оставшуюся крупу
            storage[cereal] = containerCapacity
            return amount - remainingSpace
        }
    }

    // Метод для получения крупы из контейнера
    override fun getCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество не может быть отрицательным" }

        // Получаем текущее количество крупы в контейнере
        val currentAmount = storage.getOrDefault(cereal, 0f)

        if (amount > currentAmount) {
            // Если количество запрашиваемой крупы больше, чем есть в контейнере
            storage[cereal] = 0f
            return currentAmount
        } else {
            // Если запрашиваемое количество меньше или равно текущему
            storage[cereal] = currentAmount - amount
            return amount
        }
    }

    // Метод для удаления пустого контейнера
    override fun removeContainer(cereal: Cereal): Boolean {
        val currentAmount = storage.getOrDefault(cereal, 0f)
        return if (currentAmount == 0f) {
            // Если контейнер пуст, удаляем его
            storage.remove(cereal)
            true
        } else {
            // Если контейнер не пуст, не удаляем
            false
        }
    }

    // Метод для получения количества крупы в контейнере
    override fun getAmount(cereal: Cereal): Float {
        return storage.getOrDefault(cereal, 0f)
    }

    // Метод для получения доступного места в контейнере для указанной крупы
    override fun getSpace(cereal: Cereal): Float {
        val currentAmount = storage.getOrDefault(cereal, 0f)
        return containerCapacity - currentAmount
    }

    // Текстовое представление хранилища
    override fun toString(): String {
        return storage.entries.joinToString("\n") { "${it.key.local}: ${it.value}" }
    }
}