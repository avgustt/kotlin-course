package com.sergei.kotlincourse.lesson25.homework

// Анонимная функция
val anonymousFunction = fun(
    map: Map<List<Any>, Set<Any>>,
    intVal: Int,
    stringVal: String,
    booleanVal: Boolean,
    doubleVal: Double,
    charVal: Char,
    listVal: List<Any>,
    setVal: Set<Any>,
    mapVal: Map<Any, Any>,
    nullableVal: String?
): String {
    println("intVal: $intVal")
    println("stringVal: $stringVal")
    println("booleanVal: $booleanVal")
    println("doubleVal: $doubleVal")
    println("charVal: $charVal")
    println("listVal: $listVal")
    println("setVal: $setVal")
    println("mapVal: $mapVal")
    println("nullableVal: $nullableVal")
    println("map: $map")

    return intVal.toString() +
            stringVal +
            booleanVal.toString() +
            doubleVal.toString() +
            charVal.toString() +
            listVal.toString() +
            setVal.toString() +
            mapVal.toString() +
            (nullableVal ?: "null") +
            map.toString()
}

// Лямбда с указанием типа
val lambdaWithType: (Map<List<Any>, Set<Any>>, Int, String, Boolean, Double, Char, List<Any>, Set<Any>, Map<Any, Any>, String?) -> String =
    { map, intVal, stringVal, booleanVal, doubleVal, charVal, listVal, setVal, mapVal, nullableVal ->
        println("intVal: $intVal")
        println("stringVal: $stringVal")
        println("booleanVal: $booleanVal")
        println("doubleVal: $doubleVal")
        println("charVal: $charVal")
        println("listVal: $listVal")
        println("setVal: $setVal")
        println("mapVal: $mapVal")
        println("nullableVal: $nullableVal")
        println("map: $map")

        intVal.toString() +
                stringVal +
                booleanVal.toString() +
                doubleVal.toString() +
                charVal.toString() +
                listVal.toString() +
                setVal.toString() +
                mapVal.toString() +
                (nullableVal ?: "null") +
                map.toString()
    }

// Лямбда без указания типа
val lambdaWithoutType = { map: Map<List<Any>, Set<Any>>, intVal: Int, stringVal: String, booleanVal: Boolean, doubleVal: Double, charVal: Char, listVal: List<Any>, setVal: Set<Any>, mapVal: Map<Any, Any>, nullableVal: String? ->
    println("intVal: $intVal")
    println("stringVal: $stringVal")
    println("booleanVal: $booleanVal")
    println("doubleVal: $doubleVal")
    println("charVal: $charVal")
    println("listVal: $listVal")
    println("setVal: $setVal")
    println("mapVal: $mapVal")
    println("nullableVal: $nullableVal")
    println("map: $map")

    intVal.toString() +
            stringVal +
            booleanVal.toString() +
            doubleVal.toString() +
            charVal.toString() +
            listVal.toString() +
            setVal.toString() +
            mapVal.toString() +
            (nullableVal ?: "null") +
            map.toString()
}

// Тестирование
fun main() {
    val exampleMap: Map<List<Any>, Set<Any>> = mapOf(
        listOf(1, 2, 3) to setOf("a", "b"),
        listOf(4, 5) to setOf("c", "d")
    )

    // Использование анонимной функции
    println("\nAnonymous Function:")
    println(
        anonymousFunction(
            exampleMap, 42, "Hello", true, 3.14, 'X',
            listOf(1, 2, 3), setOf("a", "b", "c"), mapOf("key" to "value"), null
        )
    )

    // Использование лямбды с указанием типа
    println("\nLambda with Type:")
    println(
        lambdaWithType(
            exampleMap, 42, "Hello", true, 3.14, 'X',
            listOf(1, 2, 3), setOf("a", "b", "c"), mapOf("key" to "value"), null
        )
    )

    // Использование лямбды без указания типа
    println("\nLambda without Type:")
    println(
        lambdaWithoutType(
            exampleMap, 42, "Hello", true, 3.14, 'X',
            listOf(1, 2, 3), setOf("a", "b", "c"), mapOf("key" to "value"), null
        )
    )
}
