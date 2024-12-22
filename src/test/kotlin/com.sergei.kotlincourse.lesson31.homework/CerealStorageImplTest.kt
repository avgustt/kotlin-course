package com.sergei.kotlincourse.lesson31.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CerealStorageTest {

    private lateinit var cerealStorage: CerealStorage

    @BeforeEach
    fun setUp() {
        cerealStorage = CerealStorageImpl(10f, 100f) // контейнер вмещает 10 единиц, хранилище вмещает 100 единиц
    }

    // Тест для addCereal
    @Test
    fun `should throw IllegalArgumentException when amount is negative`() {
        assertThrows<IllegalArgumentException> {
            cerealStorage.addCereal(Cereal.BUCKWHEAT, -5f)
        }
    }

    @Test
    fun `should throw IllegalStateException when storage cannot accommodate new cereal`() {
        cerealStorage.addCereal(Cereal.BUCKWHEAT, 10f)
        assertThrows<IllegalStateException> {
            cerealStorage.addCereal(Cereal.BUCKWHEAT, 100f) // хранилище не может вмещать столько
        }
    }

    @Test
    fun `should return remaining cereal amount when container is full`() {
        val remaining = cerealStorage.addCereal(Cereal.BUCKWHEAT, 15f)
        assertEquals(5f, remaining, 0.01f) // контейнер вмещает 10, но добавлено 15, оставшаяся крупа 5
    }

    @Test
    fun `should add cereal successfully`() {
        val remaining = cerealStorage.addCereal(Cereal.BUCKWHEAT, 5f)
        assertEquals(0f, remaining, 0.01f) // добавили 5, осталась 0
        assertEquals(5f, cerealStorage.getAmount(Cereal.BUCKWHEAT), 0.01f) // в контейнере должно быть 5
    }
}

