package com.sergei.kotlincourse.lesson13

fun main() {

//1. Предварительные задачи на использование методов.
//Задачи на приведение коллекций к значению:

// 1. Проверить, что размер коллекции больше 5 элементов.

    println(listOf(1, 2, 3, 4, 5, 6).size)

//2. Проверить, что коллекция пустая

    val listForNull: List<Int>? = listOf()
    println(listForNull?.isEmpty())

//3. Проверить, что коллекция не пустая
    val listForNotNull: List<String> = listOf(" ")
    println(listForNotNull.isNotEmpty())

//4. Взять элемент по индексу или создать значение если индекса не существует

    println(listOf(1, 2, 3).getOrElse(4) { 5 })

//5. Собрать коллекцию в строку

    println(listOf(1, 2, 3, 4, 5, 6).joinToString(" separator "))

//6. Посчитать сумму всех значений

    println(listOf(1, 2, 3, 4, 5, 6).sum())

//7. Посчитать среднее

    println(listOf(1, 2, 3, 4, 5, 6).average())

//8. Взять максимальное число

    println(listOf(1, 2, 3, 4, 5, 6).maxOrNull())

//9. Взять минимальное число

    println(listOf(1, 2, 3, 4, 5, 6, -100500).minOrNull())

//10. Взять первое число или null

    println(listOf(1, 2, 3, 4, 5, 6).firstOrNull())

//11. Проверить что коллекция содержит элемент

    println(listOf(1, 2, 3, 4, 5, 6).contains(6))


//Задачи на обработку коллекций:

//1. Отфильтровать коллекцию по диапазону 18-30

    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter { it in 4..7 })

//2. Выбрать числа, которые не делятся на 2 и 3 одновременно

    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).filterNot { it % 2 == 0 && it % 3 == 0 })

//3. Очистить текстовую коллекцию от null элементов

    println(listOf<Int?>(null, 2, null, 4, 5, 6, 7, 8, 9, null).filterNotNull())

//4. Преобразовать текстовую коллекцию в коллекцию длин слов

    println(listOf("один", "два", "три", "четыре", "пять", "шесть"))

//5. Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова

    println(listOf("один", "два", "три", "четыре", "пять", "шесть").associate { it to it.reversed() })

//6. Отсортировать список в алфавитном порядке

    println(listOf("о", "д", "т", "ч", "п", "ш").sorted())

//7. Отсортировать список по убыванию

    println(listOf("о", "д", "т", "ч", "п", "ш").sortedDescending())

//8. Распечатать квадраты элементов списка

    listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach { println(it * it) }

//9. Группировать список по первой букве слов

    println(listOf("один", "два", "три", "четыре", "пять", "шесть").sorted())

//10. Очистить список от дублей

    println(listOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5).distinct())

//11. Взять первые 3 элемента списка

    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).take(3))

//12. Взять последние 3 элемента списка

    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeLast(3))

    println(for2(listFor2)) // задание 2

    println(norma) // задание 3

    println(catalog) // задание 4

    println("%.2f".format(howLong)) // задание 5

    println(goodNumbers) // задание 6

    println(goodAges) // задание 7

}

//Задание 2: Характеристика числовой коллекции
//Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции
//используя конструкцию when
//Если коллекция пустая - “Пусто”
//Если количество элементов меньше пяти - “Короткая”
//Если коллекция начинается с 0 - “Стартовая”
//Если сумма всех чисел больше 10000 - “Массивная”
//Если среднее значение равно 10 - “Сбалансированная”
//Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
//Если максимальное число меньше -10 - “Отрицательная”
//Если минимальное число больше 1000 - “Положительная”
//Если содержит одновременно числа 3 и 14 - “Пи***тая”
//Иначе - “Уникальная”
//
//Вызвать метод с данными, подходящими под каждую из веток

val listFor2: List<Int> = listOf(1, 10, 20, 30, 40, 50, 60, 70, 80, 90)

fun for2 (list: List<Int>): String {
    return when {
        list.isEmpty() -> {"Пусто"}
        list.size < 5 -> {"Короткая"}
        list.firstOrNull() == 0 -> {"Стартовая"}
        list.sum() > 1000 -> {"Массивная"}
        list.average() == 10.0 -> {"Сбалансированная"}
        list.joinToString("").length > 20 -> {"Клейкая"}
        list.max() < -10 -> {"Отрицательная"}
        list.min() > 1000 -> {"Положительная"}
        list.contains(3) && list.contains(14) -> {"Пи***тая"}
        else -> {"Уникальная"}
    }
}

//Задание 3: Анализ Учебных Оценок
//Начальные значения:

val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

//Цель: Отфильтровать удовлетворительные оценки (>=60),
// отсортировать оставшиеся по возрастанию и взять первые 3.

val norma = grades.filter { it >= 60 }
    .sorted()
    .take(3)


//Задание 4: Создание каталога по первой букве.
//Начальные значения:
val list = listOf(
    "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
    "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод",
    "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка",
    "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир",
    "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
)
//Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.

val catalog = list.map { it.lowercase() }
    .sorted().groupBy { it[0] }

//Задание 5: Подсчёт средней длины слов в списке.
//Начальные значения из задачи 3.
//Цель: Перевести все слова в количество букв, подсчитать среднее значение. Вывести форматированный текст с
//двумя знаками после запятой.

val howLong = list.map { it.length }.average()

//Задание 6: Категоризация чисел.
//Начальные значения:

val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

//Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).

val goodNumbers = numbers.distinct().sortedDescending().groupBy { if (it % 2 == 0) "Четные" else "Нечетные" }

//Задание 7: Поиск первого подходящего элемента
//Начальные значения:

val ages = listOf(22, 18, 30, 45, 17, null, 60)

//Цель: Найти первый возраст в списке, который соответствует условию (больше 18), преобразовать его к строке, или вернуть сообщение "Подходящий возраст не найден".

val goodAges = ages.filterNotNull().find { it > 18 }?.toString()?: " Подходящий возраст не найден"