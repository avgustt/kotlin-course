package final1

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

    override fun addCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество крупы не может быть отрицательным" }

        val currentAmount = storage.getOrDefault(cereal, 0f)

        if (currentAmount == 0f && storage.size >= (storageCapacity / containerCapacity).toInt()) {
            throw IllegalStateException("Хранилище не позволяет разместить новый контейнер")
        }

        val spaceLeft = containerCapacity - currentAmount
        val amountToAdd = minOf(spaceLeft, amount)

        storage[cereal] = currentAmount + amountToAdd
        return amount - amountToAdd
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество крупы не может быть отрицательным" }
        val currentAmount = storage.getOrDefault(cereal, 0f)
        val amountToGet = minOf(currentAmount, amount)
        storage[cereal] = currentAmount - amountToGet
        return amountToGet
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        val currentAmount = storage.getOrDefault(cereal, 0f)
        if (currentAmount > 0) return false
        storage.remove(cereal)
        return true
    }

    override fun getAmount(cereal: Cereal): Float {
        return storage.getOrDefault(cereal, 0f)
    }

    override fun getSpace(cereal: Cereal): Float {
        return containerCapacity - storage.getOrDefault(cereal, 0f)
    }

    override fun toString(): String {
        return storage.entries.joinToString { "${it.key.local}: ${it.value}" }
    }

}