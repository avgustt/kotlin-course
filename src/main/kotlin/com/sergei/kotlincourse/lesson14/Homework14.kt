package com.sergei.kotlincourse.lesson14

fun main () {
//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.

    val testTimes = mapOf("Трус" to 5, "Балбес" to 12, "Бывалый" to 8)
    println(testTimes.values.average())


//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов
// а значения - строка с метаданными. Выведите список всех тестовых методов.

    val metadata = mapOf("test1" to "metadata1", "test2" to "metadata2")
    println(metadata.keys)

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

    val testResults = mutableMapOf("test1" to "Passed", "test2" to "Failed")
    testResults["test3"] = "Passed"
    println(testResults)

//Посчитайте количество успешных тестов в словаре с результатами.

    println(testResults.count { it.value == "Passed" })

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.

    val bugTracking = mutableMapOf("bug1" to "open", "bug2" to "fixed")
    bugTracking.remove("bug2")
    println(bugTracking)

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите
//сообщение о странице и статусе её проверки.

    val pageStatus = mapOf("page1.com" to "200 OK", "page2.com" to "404 Not Found")
    pageStatus.forEach { (adres, status) ->
        println("$adres - в статусе: $status")
    }

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.

    val serviceResponseTimes = mapOf("service1" to 120, "service2" to 85)
    println(serviceResponseTimes.filter { it.value > 100 })

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
//Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.

    val apiStatus = mapOf("endpoint1" to "200 OK", "endpoint2" to "200 OK", "endpoint3" to "404 Not Found")
    println(apiStatus.getOrElse("endpoint4") { "Не был протестирован" })

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
//получите значение для "browserType". Ответ не может быть null.

    val config = mapOf("browserType" to "Chrome", "timeout" to "30s")
    println(config.getValue("browserType"))

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.

    val configNew = config.toMutableMap()
    println(configNew)

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
//получите настройки для конкретной модели или верните настройки по умолчанию

    val deviceSettings = mapOf("iPhone" to "Купить Хуавей", "Samsung" to "Перезагрузить")
    println(deviceSettings.getOrDefault("Samsung", "выключи телефон и или жить жизнь"))

//Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.

    val errorCodes = mapOf(404 to "Not Found", 500 to "Server Error")
    println(errorCodes.containsKey(404))

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
//а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь,
//оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.

    val testScenarios = mapOf("TestID_1.0" to "Passed", "TestID_2.0" to "Failed", "TestID_3.0" to "Skipped")
    println(testScenarios.filterKeys { it.endsWith("3.0") })

//У вас есть словарь, где ключи — это названия функциональных модулей приложения,
//а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.

    val modules = mapOf("Module1" to "Passed", "Module2" to "Failed")
    println(modules.filterValues { it == "Failed" }.keys)

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

    val additionalSettings = mapOf("RAM" to "16GB")
    configNew.putAll(additionalSettings)
    println(configNew)

//Объедините два неизменяемых словаря с данными о багах.

    val bugs1 = mapOf("bug1" to "open")
    val bugs2 = mapOf("bug2" to "closed")
    val bugs3 = bugs1 + bugs2
    println(bugs3)

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    val tempData = mutableMapOf("temp1" to "data")
    tempData.clear()
    println(tempData)

//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)

    val testResultsWithSkipped =
        mapOf("test1" to "Passed", "test2" to "Skipped", "test3" to "Skipped", "test4" to "Passed")
    val testResultsWithSkipped1 = testResultsWithSkipped.filter { it.value == "Skipped" }
    println(testResultsWithSkipped1)

//Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.

    val configs = mutableMapOf("config1" to "old", "config2" to "new")
    configs.remove("config1")
    println(configs)

//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
//(ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".

    val testResultsMap = mapOf("test1" to "Passed", "test2" to "Failed")
    println(testResultsMap.map { "${it.key} Test ID: ${it.value}" })

//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.

    val testResultsMapForArchive = configs.toMap()
    println(testResultsMapForArchive)

//Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
//заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод,
//например getNameById(id: String))

    val idTestTimes = mapOf("первый" to 120, "второй" to 90)
    fun getS(id: String): String = "Name$id"
    val newC = idTestTimes.mapKeys { getS(it.key) }
    println(newC)

//Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%,
//чтобы учесть новые условия тестирования.

    val performanceScores = mutableMapOf("v1" to 100, "v2" to 200)
    val performanceScores1 = performanceScores.mapValues { it.value  * 1.1}
    println(performanceScores1)

//Проверьте, пуст ли словарь с ошибками компиляции тестов.

    val compileErrors = mapOf<Int, String>()
    println(compileErrors.isEmpty())

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    val loadTestResults = mapOf("test1" to "Passed")
    println(loadTestResults.isNotEmpty())

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

    println(testResultsMap.all { it.value == "Passed" })

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

    println(testResultsMap.any() { it.value == "Failed" })

//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
//которые не прошли успешно и содержат в названии “optional”.

    val serviceResults = mapOf(
        "optionalTest1" to "Failed",
        "mandatoryTest" to "Passed",
        "optionalFastTest" to "Failed",
        "optionalTest2" to "Passed"
    )

    val serviceResultsFiltered = serviceResults
        .filterKeys { it.contains("optional") }
            .filterValues { it == "Failed" }
    println(serviceResultsFiltered)

}