package com.sergei.kotlincourse.lesson19.homework

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    publicVal
    //потому что он публичный в основном классе
    : String
) : BaseClass(privateVal, protectedVal, privateVal) {

    override fun verifyPublicField(value: String): Boolean {
        return true
    }
//"измени меня из функции main() через сеттер в наследнике"
    fun setProtectedField1 (value: String) {
        protectedField = value
    }

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
    //она наследуемая как побличная

    // проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    //функция приватная и переопределения быть не может
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
}
