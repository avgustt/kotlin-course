package com.sergei.kotlincourse.lesson11

fun main() {

//Задание 1: Создание Пустого Словаря
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val empryMap: Map<Int,Int> = mapOf()
    println(empryMap)

//Задание 2: Создание и Инициализация Словаря
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double

    val mapFo2: Map<Float, Double> = mapOf(
        0.1f to 0.2,
        0.3f to 0.4,
        0.5f to 0.6
    )

    println(mapFo2)

//Задание 3: Создание Изменяемого Словаря
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val mutableMapFo3: MutableMap<Int, String> = mutableMapOf(
        1 to "в поле воин"
    )

    println(mutableMapFo3)

//Задание 4: Добавление Элементов в Словарь
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

    mutableMapFo3[1000] = "чертей"

    println(mutableMapFo3)

//Задание 5: Получение Значений из Словаря
//Используя словарь из предыдущего задания, извлеките значение, используя ключ.
//Попробуй получить значение с ключом, которого в словаре нет.

    val fistKeyFo5 = mutableMapFo3[1]

    println(fistKeyFo5)

    val secondKeyFo5 = mutableMapFo3[7]

    println(secondKeyFo5)

//Задание 6: Удаление Элементов из Словаря
//Удалите определенный элемент из изменяемого словаря по его ключу.

    mutableMapFo3.remove(1000)

    println(mutableMapFo3)

//Задание 7: Перебор Словаря в Цикле
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
//Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

    val MapFor7: Map<Double, Int> = mapOf(10.1 to 2, 2.2 to 5, 4.0 to 9, 0.0 to 10)

    println(MapFor7)

    for (entreis in MapFor7)
        if (entreis.key == 0.0) {
            println("бесконечность")
        } else println(entreis.key / entreis.value)

//Задание 8: Перезапись Элементов Словаря
//Измените значение для существующего ключа в изменяемом словаре.

    val mutableMapFor8: MutableMap<Int,String> = mutableMapOf(1 to "один", 2 to "два", 3 to "три")

    mutableMapFor8[3] = "не три"

    println(mutableMapFor8)

//Задание 9: Сложение Двух Словарей
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

    val fistMapFor9: Map<Int, String> = mapOf(10 to "негритят", 20 to "век фокс")

    val sefondMapFor9: Map<Int, String> = mapOf(12 to "апостолов", 7 to "дней недели")

    val mutableMapFor9: MutableMap<Int,String> = mutableMapOf()

    for ((numbers, info) in fistMapFor9) {
        mutableMapFor9[numbers] = info
    }
    for ((numbers, info) in sefondMapFor9) {
        mutableMapFor9[numbers] = info
    }

    println(mutableMapFor9)

//Задание 10: Словарь с Сложными Типами
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
// Добавьте несколько элементов в этот словарь.

    val soHardMapFor10: Map<String, List<Int>> = mapOf("Первая строка" to listOf<Int>(1, 2, 3, 4, 5), "Вторая строка" to listOf<Int>(1, 2, 3, 4, 5))

    println(soHardMapFor10)

//Задание 11: Использование Множества в Качестве Значения
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
//Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.

    val mutableMapWithSet: MutableMap<Int, MutableSet<String>> = mutableMapOf(
        1 to mutableSetOf<String>("11", "22", "33", "44"),
        2 to mutableSetOf<String>("44", "55", "66", "77")
    )

    val setFor11: MutableSet<String>? = mutableMapWithSet[1]

    setFor11?.add("99")

    println(setFor11)

//Задание 12: Поиск Элемента по Значению
//Создай словарь, где ключами будут пары чисел.
//Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

    val mapIntFor12: Map<Pair<Int, Int>, Int> = mapOf(
        Pair(1, 2) to 1,
        Pair(3, 4) to 2,
        Pair(5, 6) to 3,
        Pair(6, 5) to 4,
        Pair(4, 3) to 5,
        Pair(2, 1) to 6
    )

    for ((key, value) in mapIntFor12) {
        val (a, b) = key
        if ( a == 5 || b == 5) {
            println(key)
        }
    }

//Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.
//Задание 6: Словарь Библиотека
//Ключи - автор книги, значения - список книг

    val mapForBook: MutableMap<String, MutableSet<String>> = mutableMapOf(
        "Пушкин" to mutableSetOf<String>("Евгений Онегин", "Сказка о царе Салтане"),
        "Гоголь" to mutableSetOf<String>("Нос", "Мертвый души")
    )

    println(mapForBook)

//Задание 12: Справочник Растений
//Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

    val mapForTree: Map<String, List<String>> = mapOf(
        "Деревья" to listOf<String>("березы", "тополя", "энты"),
        "Цветы" to listOf<String>("ромашки", "розы", "васильки")
    )

    println(mapForTree)

//Задание 8: Четвертьфинала
//Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val mapForSport: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Федор Двинятин" to mutableListOf<String>("Гудков Дмитрий", "Наталия Медведева"),
        "Дети лейтенанта Шмидта" to mutableListOf<String>("Григорий Малыгин", "Вячеслав Гуливицкий")
    )

    println(mapForSport)

//Задание 9: Курс лечения
//Ключи - даты, значения - список препаратов принимаемых в дату

    val mapForTreatment: Map<String, List<String>> = mapOf(
        "20.10.2024" to listOf<String>("Витамины", "Парацетамол"),
        "21.10.2024" to listOf<String>("Рыбий жир", "Витамины"),
        "22.10.2024" to listOf<String>("Обезболивающее", "Суппозитории"),
    )

    println(mapForTreatment)

//Задание 10: Словарь Путешественника
//Ключи - страны, значения - словари из городов со списком интересных мест.

    val mapForTravel: Map<String, Map<String, List<String>>> = mapOf(
        "Франция" to mapOf(
            "Париж" to listOf("Эйфелева башня", "Лувр", "Нотр-Дам-де-Пари", "Триумфальная арка"),
            "Леон" to listOf("Леонский собор", "Базилика Святого Исидура"),
            "Анси" to listOf("Старая Тюрьма", "Озеро Анси"),
        ),
        "Италия" to mapOf(
            "Рим" to listOf("Колизей", "Старый город", "Ватикан"),
            "Пиза" to listOf("Пизанская башня"),
            "Ниаполь" to listOf("Портовая крепость", "Везувий", "Городская площадь")
        ),
        "Испания" to mapOf(
            "Барселона" to listOf("Храм святого семейства", "Дом Бальо", "фонтан Монжуик"),
            "Мадрид" to listOf("Музей Прадо", "Королевский дворец", "Паркс дель Ретиро")
        ))

    println(mapForTravel)

}