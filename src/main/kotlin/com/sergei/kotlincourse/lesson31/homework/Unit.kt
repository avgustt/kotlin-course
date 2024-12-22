package com.sergei.kotlincourse.lesson31.homework


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CerealStorageImplTest {

    private val storage = CerealStorageImpl(10f, 20f)

    @Test
    fun `should throw if cereal amount is negative`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            storage.addCereal(Cereal.RICE, -1f)
        }
    }

    @Test
    fun `should return 0 if container not full`() {
        Assertions.assertEquals(0f, storage.addCereal(Cereal.RICE, 9.9f), 0.01f)
    }

    @Test
    fun `should return rest if added cereal exceeds container capacity`() {
        Assertions.assertEquals(0.1f, storage.addCereal(Cereal.RICE, 10.1f), 0.01f)
    }

    @Test
    fun `should throw if storage capacity exceeded`() {
        storage.addCereal(Cereal.RICE, 0.1f)
        storage.addCereal(Cereal.PEAS, 0.1f)
        Assertions.assertThrows(IllegalStateException::class.java) {
            storage.addCereal(Cereal.BUCKWHEAT, 0.1f)
        }
    }
}

//2.2. Реализация addCereal

override fun addCereal(cereal: Cereal, amount: Float): Float {
    require(amount >= 0) {
        "Количество крупы не может быть отрицательным"
    }
    checkStorageCapacity(cereal)
    val currentAmount = storage.getOrDefault(cereal, 0f)
    val amountForAdding = minOf(getSpace(cereal), amount)
    storage[cereal] = currentAmount + amountForAdding
    return amount - amountForAdding
}

//2.3. Тесты для getCereal

@Test
fun `should return amount if available`() {
    storage.addCereal(Cereal.RICE, 5f)
    Assertions.assertEquals(4f, storage.getCereal(Cereal.RICE, 4f))
}

@Test
fun `should return remainder if not enough cereal`() {
    storage.addCereal(Cereal.RICE, 3f)
    Assertions.assertEquals(3f, storage.getCereal(Cereal.RICE, 5f))
}

@Test
fun `should throw if amount is negative`() {
    Assertions.assertThrows(IllegalArgumentException::class.java) {
        storage.getCereal(Cereal.RICE, -1f)
    }
}

//2.4. Реализация getCereal

override fun getCereal(cereal: Cereal, amount: Float): Float {
    require(amount >= 0) {
        "Количество крупы не может быть отрицательным"
    }
    val currentAmount = storage.getOrDefault(cereal, 0f)
    val amountToGet = minOf(currentAmount, amount)
    storage[cereal] = currentAmount - amountToGet
    return amountToGet
}

//2.5. Тесты для removeContainer

@Test
fun `should remove empty container`() {
    storage.addCereal(Cereal.RICE, 0f)
    Assertions.assertTrue(storage.removeContainer(Cereal.RICE))
}

@Test
fun `should not remove non-empty container`() {
    storage.addCereal(Cereal.RICE, 5f)
    Assertions.assertFalse(storage.removeContainer(Cereal.RICE))
}

//2.6. Реализация removeContainer

override fun removeContainer(cereal: Cereal): Boolean {
    val currentAmount = storage.getOrDefault(cereal, 0f)
    if (currentAmount == 0f) {
        storage.remove(cereal)
        return true
    }
    return false
}

//2.7. Тесты для getAmount и getSpace

@Test
fun `should return correct amount`() {
    storage.addCereal(Cereal.RICE, 3.5f)
    Assertions.assertEquals(3.5f, storage.getAmount(Cereal.RICE))
}

@Test
fun `should return correct space`() {
    storage.addCereal(Cereal.RICE, 3.5f)
    Assertions.assertEquals(6.5f, storage.getSpace(Cereal.RICE))
}

//2.8. Реализация getAmount и getSpace

override fun getAmount(cereal: Cereal): Float {
    return storage.getOrDefault(cereal, 0f)
}

override fun getSpace(cereal: Cereal): Float {
    return containerCapacity - getAmount(cereal)
}

//2.9. Реализация toString

override fun toString(): String {
    return storage.entries.joinToString(", ") { "${it.key}: ${it.value}" }
}

