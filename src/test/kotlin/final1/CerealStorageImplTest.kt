package final1

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class CerealStorageImplTest {

    private val storage = CerealStorageImpl(10f, 50f) // контейнер: 10, общее: 50

    @Test
    fun `should add cereal to existing container`() {
        storage.addCereal(Cereal.RICE, 5f)
        assertEquals(5f, storage.getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun `should increase amount after adding cereal`() {
        storage.addCereal(Cereal.RICE, 5f)
        storage.addCereal(Cereal.RICE, 3f)
        assertEquals(8f, storage.getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun `should return excess cereal if container is full`() {
        val excess = storage.addCereal(Cereal.RICE, 15f)
        assertEquals(5f, excess, 0.01f)
        assertEquals(10f, storage.getAmount(Cereal.RICE), 0.01f)
    }

    @Test
    fun `should throw exception if no space for new cereal container`() {
        storage.addCereal(Cereal.RICE, 10f)
        storage.addCereal(Cereal.BUCKWHEAT, 10f)
        storage.addCereal(Cereal.MILLET, 10f)
        storage.addCereal(Cereal.PEAS, 10f)
        assertThrows<IllegalStateException> {
            storage.addCereal(Cereal.BULGUR, 5f)
        }
    }

    @Test
    fun `should throw exception for negative amount`() {
        assertThrows<IllegalArgumentException> {
            storage.addCereal(Cereal.RICE, -5f)
        }
    }

    @Test
    fun `should handle adding different cereals`() {
        storage.addCereal(Cereal.RICE, 10f)
        storage.addCereal(Cereal.BUCKWHEAT, 5f)
        assertEquals(10f, storage.getAmount(Cereal.RICE), 0.01f)
        assertEquals(5f, storage.getAmount(Cereal.BUCKWHEAT), 0.01f)
    }
}