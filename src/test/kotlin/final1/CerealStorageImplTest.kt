package final1


import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import ru.webrelab.kie.cerealstorage.Cereal
import ru.webrelab.kie.cerealstorage.CerealStorageImpl


class CerealStorageImplTest {

//Тест для объема одного контейнера
    @Test
    fun `test container capacity initialization`() {
        val storage = CerealStorageImpl(10f, 50f)
        assertEquals(10f, storage.containerCapacity, 0.01f)
    }

//Проверка выбрасывания исключения при отрицательном значении при инициализации
    @Test
    fun `throws IllegalArgumentException when container capacity is negative`() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-10f, 50f)
        }
        assertEquals("Ёмкость контейнера не может быть отрицательной", exception.message)
    }

//Тест для общего объема хранилища
    @Test
    fun `test storage capacity initialization`() {
        val storage = CerealStorageImpl(10f, 50f)
        assertEquals(50f, storage.storageCapacity, 0.01f)
    }

//Проверка исключения, если значение меньше, чем containerCapacity при инициализации storageCapacity
    @Test
    fun `throws IllegalArgumentException when storage capacity is less than container capacity`() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(10f, 5f)
        }
        assertEquals("Ёмкость хранилища не должна быть меньше ёмкости одного контейнера", exception.message)
    }

//Добавление крупы к контейнеру
    @Test
    fun `test add cereal to existing container`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 5f)
        assertEquals(5f, storage.getAmount(Cereal.RICE), 0.01f)
    }

//Добавление крупы в новый контейнер
    @Test
    fun `test add cereal to new container`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 5f)
        storage.addCereal(Cereal.RICE, 5f)
        assertEquals(10f, storage.getAmount(Cereal.RICE), 0.01f)
    }



//Проверка на превышение объема хранилища
    @Test
    fun `test overflow returns leftover cereal`() {
        val storage = CerealStorageImpl(5f, 10f)

        val leftover1 = storage.addCereal(Cereal.RICE, 3f)
        assertEquals(0f, leftover1, 0.01f)

        val leftover2 = storage.addCereal(Cereal.RICE, 3f)
        assertEquals(1f, leftover2, 0.01f)

        assertEquals(5f, storage.getAmount(Cereal.RICE), 0.01f)
    }

//Проверка возвращаемого значения при добавлении крупы если контейнер заполнился
    @Test
    fun `test return remaining cereal when container is full`() {
        val storage = CerealStorageImpl(10f, 50f)
        val remaining = storage.addCereal(Cereal.RICE, 15f)
        assertEquals(5f, remaining, 0.01f) // Ожидаем, что 5f не влезет в контейнер
    }

//Проверка на отрицательное значение при добавлении крупы
    @Test
    fun `throws IllegalArgumentException when adding negative amount of cereal`() {
    val storage = CerealStorageImpl(10f, 50f)
    val exception = assertThrows(IllegalArgumentException::class.java) {
        storage.addCereal(Cereal.RICE, -5f)
    }
    // Исправляем сообщение на то, которое реально выбрасывается из кода:
    assertEquals("Количество не может быть отрицательным", exception.message)
}

//Проверка на уничтожение пустого контейнера
    @Test
    fun `test remove empty container`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 5f)
        storage.getCereal(Cereal.RICE, 5f) // Все забрали, контейнер пуст
        assertTrue(storage.removeContainer(Cereal.RICE)) // Контейнер должен быть уничтожен
    }

//Проверка на невозможность уничтожения контейнера, если он не пуст
    @Test
    fun `test do not remove non-empty container`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 5f)
        assertFalse(storage.removeContainer(Cereal.RICE)) // Контейнер не должен быть уничтожен, так как не пуст
    }

//Проверка корректности уменьшения количества крупы
    @Test
    fun `test get cereal decreases amount`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 5f)
        storage.getCereal(Cereal.RICE, 2f) // Извлекаем 2 единицы риса
        assertEquals(3f, storage.getAmount(Cereal.RICE), 0.01f) // Проверяем, что осталось 3
    }

//Проверка на попытку уменьшить количество крупы больше, чем есть в контейнере
    @Test
    fun `test get cereal when amount exceeds available stock`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 5f)
        val remaining = storage.getCereal(Cereal.RICE, 10f) // Пытаемся забрать больше, чем есть
        assertEquals(5f, remaining, 0.01f) // Возвращается вся оставшаяся крупа
        assertEquals(0f, storage.getAmount(Cereal.RICE), 0.01f) // В контейнере ничего не осталось
    }

//Уменьшение нескольких видов крупы
    @Test
    fun `test get different cereals`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 5f)
        storage.addCereal(Cereal.BUCKWHEAT, 7f)

        storage.getCereal(Cereal.RICE, 3f)
        storage.getCereal(Cereal.BUCKWHEAT, 4f)

        assertEquals(2f, storage.getAmount(Cereal.RICE), 0.01f) // Осталось 2 риса
        assertEquals(3f, storage.getAmount(Cereal.BUCKWHEAT), 0.01f) // Осталось 3 гречки
    }

//Уменьшение крупы несколько раз
    @Test
    fun `test get cereal multiple times`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 10f)

        storage.getCereal(Cereal.RICE, 3f)
        storage.getCereal(Cereal.RICE, 4f)

        assertEquals(3f, storage.getAmount(Cereal.RICE), 0.01f) // Осталось 3 риса
    }

//Удаление контейнера
    @Test
    fun `test remove container when empty`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 10f)
        storage.getCereal(Cereal.RICE, 10f) // Убираем все
        assertTrue(storage.removeContainer(Cereal.RICE)) // Контейнер должен быть уничтожен
    }

//Попытка удалить несуществующий контейнер
    @Test
    fun `test remove non-existing container`() {
        val storage = CerealStorageImpl(10f, 50f)
        // Согласно текущему коду, если контейнера нет, метод вернёт true (т.к. currentAmount == 0f).
        assertTrue(storage.removeContainer(Cereal.RICE))
    }

//Получение количества крупы в контейнере
    @Test
    fun `test get amount of cereal`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 5f)
        assertEquals(5f, storage.getAmount(Cereal.RICE), 0.01f) // Проверяем количество риса
    }

//Проверка количества крупы, которой нет в контейнере
    @Test
    fun `test get amount of non-existing cereal`() {
        val storage = CerealStorageImpl(10f, 50f)
        assertEquals(0f, storage.getAmount(Cereal.RICE), 0.01f) // Риса нет, ожидаем 0
    }

//Проверка доступного места в контейнере
    @Test
    fun `test get space in container`() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.RICE, 5f)
        assertEquals(5f, storage.getSpace(Cereal.RICE), 0.01f) // Ожидаем 5 единиц свободного места
    }
}