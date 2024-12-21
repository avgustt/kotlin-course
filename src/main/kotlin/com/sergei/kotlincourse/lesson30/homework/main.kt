package com.sergei.kotlincourse.lesson30.homework

//Задание 1
//Создай Enum со статусами прохождения теста (pass, broken, failure).

enum class Test() {
    PASS,
    BROKEN,
    FAILURE,
    ;

}

//Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.

enum class Housing(val nameOfThis: String) {
    HOUSE("Дом"),
    APARTMENT("Квартира"),
    COUNTRY_HOUSE("Дача"),
    PUTIN_PALACE("Дворец Путина"),
    ;
}

//Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.

enum class Space(val astronomicalUnitFromSun: Double, val massOfEarth: Double) {
    MERCURY(0.387, 0.055),
    VENUS(0.732, 0.815),
    EARTH(1.0, 1.0),
    MARS(1.52, 0.107),
    JUPITER(5.2, 317.8),
    SATURN(9.54, 95.2),
    URANUS(19.19, 14.37),
    NEPTUNE(30.07, 17.15),
    ;
}

//Задание 2
//Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости
//в порядке возрастания длины названия enum.

fun forTow() {
    Housing.entries
        .sortedBy { it.name.length }
        .forEach { println(it.nameOfThis) }
}

//Задание 3
//Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и возвращает
//Enum со статусом прохождения теста в зависимости от того как выполнится принятая лямбда.
//Если без исключений - pass, если будет AssertionError - failure, прочие исключения  - broken.

fun funThree(action: () -> Unit): Test {
    return try {
        action() // Выполняем лямбду
        Test.PASS // Если всё прошло без исключений
    } catch (e: AssertionError) {
        Test.FAILURE // Если возникло исключение AssertionError
    } catch (e: Exception) {
        Test.BROKEN // Если возникло любое другое исключение
    }
}

//Задание 4
//Создай функцию, которая принимает лямбду и возвращает enum планеты.
//Лямбда должна принимать планету и возвращать булево значение.
//Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список всех планет по какому-либо
//признаку (расстояние или вес). Вернуть нужно первый элемент из отфильтрованного списка или выкинуть
//исключение если список пустой.

fun forFor(filter: (Space) -> Boolean): Space {
    return Space.entries.firstOrNull(filter) ?: throw Exception("Список планет пуст после фильтрации")
}

fun main() {
//Проверка для задания 2
    forTow()

//Проверка для задания 3
    val result1 = funThree {
        println("Тест проходит успешно")
    }
    println(result1) // Output: PASS

    val result2 = funThree {
        throw AssertionError("Ошибка утверждения")
    }
    println(result2) // Output: FAILURE

    val result3 = funThree {
        throw IllegalArgumentException("Некорректный аргумент")
    }
    println(result3) // Output: BROKEN

//Проверка для задания 4

    val positiveFilter: (Space) -> Boolean = {
        it.massOfEarth <= 1.0 && it.astronomicalUnitFromSun <= 1.0
    }

    val negativeFilter: (Space) -> Boolean = {
        it.name.startsWith("M") && it.ordinal >= 1
    }

    println("Positive: ${forFor(positiveFilter)}")
    println("Negative: ${forFor(negativeFilter)}")
}

