package com.sergei.kotlincourse.lesson28.homework

import java.io.File

//Задача 1 Создайте текстовый файл workspace/task1/example.txt запишите в него строку
//"Hello, Kotlin!", а затем проверьте, существует ли файл.

fun task1() {
    val filePath = "workspace/task1/example.txt"
    val file = File(filePath)

    file.parentFile.mkdirs()
    file.writeText("Hello, Kotlin!")

    if (file.exists()) {
        println("Файл $filePath существует.")
    } else {
        println("Файл $filePath не существует.")
    }
}

//Задача 2 Создайте директорию workspace/task2/testDir проверьте, является ли она директорией,
//и выведите её абсолютный путь.

fun task2() {
    val dirPath = "workspace/task2/testDir"
    val dir = File(dirPath)

    dir.mkdirs()

    if (dir.isDirectory) {
        println("Директория $dirPath существует.")
        println("Абсолютный путь: ${dir.absolutePath}")
    } else {
        println("$dirPath не является директорией.")
    }
}

//Задача 3 Создайте директорию workspace/task3/structure. Внутри директории structure создайте
//папку myDir с двумя вложенными поддиректориями subDir1 и subDir2. Проверьте, что myDir действительно содержит эти поддиректории.


fun task3() {
    val baseDir = File("workspace/task3/structure/myDir")
    val subDir1 = File(baseDir, "subDir1")
    val subDir2 = File(baseDir, "subDir2")

    subDir1.mkdirs()
    subDir2.mkdirs()

    val contents = baseDir.listFiles()?.filter { it.isDirectory }?.map { it.name } ?: emptyList()
    println("Директория myDir содержит: $contents")
}

//Задача 4 Создайте директорию workspace/task4/temp. Внутри директории temp создайте несколько
//вложенных файлов и директорий. Удалите директорию workspace/task4 со всем содержимым

fun task4() {
    val tempDir = File("workspace/task4/temp")
    tempDir.mkdirs()

    File(tempDir, "file1.txt").createNewFile()
    File(tempDir, "subDir/file2.txt").apply {
        parentFile.mkdirs()
        createNewFile()
    }

    val rootDir = File("workspace/task4")
    rootDir.deleteRecursively()
    println("Директория $rootDir удалена.")
}

//Задача 5 Создайте файл workspace/task5/config/config.txt запишите в него список параметров
//(в формате ключ=значение), а затем прочитайте файл и выведите только значения.

fun task5() {
    val configFile = File("workspace/task5/config/config.txt")
    configFile.parentFile.mkdirs()
    configFile.writeText("key1=value1\nkey2=value2\nkey3=value3")

    configFile.readLines().forEach { line ->
        val value = line.substringAfter("=")
        println(value)
    }
}

//Задача 6 Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути
//директорий, а потом пути файлов

fun task6() {
    val rootDir = File("workspace")
    if (rootDir.exists()) {
        println("Список директорий и файлов:")
        rootDir.walkTopDown().forEach {
            if (it.isDirectory) {
                println("Директория: ${it.absolutePath}")
            } else {
                println("Файл: ${it.absolutePath}")
            }
        }
    } else {
        println("Директория workspace не существует.")
    }
}

//Задача 7 Создайте директорию workspace/task9/docs. Проверь, есть ли файл с именем readme.md.
//Если файла нет, создайте его и запишите текст "This is a README file."
//

fun task7() {
    val readmeFile = File("workspace/task9/docs/readme.md")
    if (!readmeFile.exists()) {
        readmeFile.parentFile.mkdirs()
        readmeFile.writeText("This is a README file.")
        println("Файл readme.md создан.")
    } else {
        println("Файл readme.md уже существует.")
    }
}

//Задача 8 Создайте файлы
// workspace/task10/data/1/4/prod/data14.mysql
// workspace/task10/data/2/3/prod/data23.mysql
// workspace/task10/data/5/2/prod/data52.mysql
// Создайте директорию workspace/task10/backup и скопируйте туда файлы из
//workspace/task10/data сохраняя структуру директорий. Для копирования используй метод copyTo

fun task8() {
    val files = listOf(
        "workspace/task10/data/1/4/prod/data14.mysql",
        "workspace/task10/data/2/3/prod/data23.mysql",
        "workspace/task10/data/5/2/prod/data52.mysql"
    )

    files.forEach { path ->
        File(path).apply {
            parentFile.mkdirs()
            createNewFile()
        }
    }

    val backupDir = File("workspace/task10/backup")
    files.forEach { path ->
        val source = File(path)
        val destination = File(backupDir, source.relativeTo(File("workspace/task10/data")).path)
        destination.parentFile.mkdirs()
        source.copyTo(destination, overwrite = true)
    }
    println("Файлы скопированы в backup.")
}

fun main() {


    // Запуск каждой задачи
    println("\nЗадача 1:")
    task1()

    println("\nЗадача 2:")
    task2()

    println("\nЗадача 3:")
    task3()

    println("\nЗадача 4:")
    task4()

    println("\nЗадача 5:")
    task5()

    println("\nЗадача 6:")
    task6()

    println("\nЗадача 7:")
    task7()

    println("\nЗадача 8:")
    task8()


}