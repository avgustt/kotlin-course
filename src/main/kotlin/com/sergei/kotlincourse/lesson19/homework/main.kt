package com.sergei.kotlincourse.lesson19.homework
//Игровой автомат
//
//Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов
//(аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)
//
//Поля:
//цвет
//модель
//включен
//ОС загружена
//список доступных игр
//наличие джойстика
//баланс вырученных средств
//владелец
//телефон поддержки.
//
//Методы:
//включить
//выключить
//загрузить ОС
//завершить работу ОС
//показать список игр
//включить игру
//оплатить игровой сеанс
//открыть сейф и выдать наличные
//выплатить выигрыш
//
//Почемучка
//Нужно скопировать код к себе и постараться ответить на все “почему” в комментариях и заданным образом доработать
//класс ChildrenClass (BaseClass доработке не подлежит)

fun main() {


val childrenClass: ChildrenClass = ChildrenClass (
    "privatVal1",
    "privatVal2",
    "privatVal3"
)

    childrenClass.publicField = "Антонио Бандерас"
    println(childrenClass.publicField)

    childrenClass.setProtectedField1("new Protectad Field")
    childrenClass.setPrinteField("new Private Field")
    childrenClass.printText()

    println(childrenClass.getAll())
}