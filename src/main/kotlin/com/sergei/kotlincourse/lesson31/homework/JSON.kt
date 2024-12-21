package com.sergei.kotlincourse.lesson31.homework

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

// Enum для должностей
enum class CharacterTypes {
    CTO,
    TEAM_LEAD,
    DEVELOPER,
    DESIGNER,
    TESTER,
    ;
}

// Data class для сотрудников
data class Employee(
    val name: String,
    val isEmployed: Boolean,
    val birthDate: String,
    val position: CharacterTypes,
    val subordinates: List<Employee>
)

fun main() {
    // Создание иерархии сотрудников
    val developer1 = Employee("Alice", true, "1990-01-15", CharacterTypes.DEVELOPER, emptyList())
    val developer2 = Employee("Bob", true, "1992-03-22", CharacterTypes.DEVELOPER, emptyList())
    val designer = Employee("Carol", true, "1988-07-09", CharacterTypes.DESIGNER, emptyList())
    val tester = Employee("Dave", true, "1995-11-12", CharacterTypes.TESTER, emptyList())

    val teamLead1 = Employee("Eve", true, "1985-05-24", CharacterTypes.TEAM_LEAD, listOf(developer1, designer))
    val teamLead2 = Employee("Frank", true, "1983-08-30", CharacterTypes.TEAM_LEAD, listOf(developer2, tester))

    val cto = Employee("Grace", true, "1980-02-14", CharacterTypes.CTO, listOf(teamLead1, teamLead2))

    // Сериализация с настройкой pretty printing
    val gson: Gson = GsonBuilder().setPrettyPrinting().create()
    val ctoJson = gson.toJson(cto)

    // Сохранение JSON в файл
    val fileName = "cto.json"
    File(fileName).writeText(ctoJson)
    println("JSON записан в файл $fileName")

    // Чтение JSON из файла и десериализация
    val ctoFromFile: Employee = gson.fromJson(File(fileName).readText(), Employee::class.java)
    println("Десериализованный объект:")
    println(ctoFromFile)
}