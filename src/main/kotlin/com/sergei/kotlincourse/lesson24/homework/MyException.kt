package com.sergei.kotlincourse.lesson24.homework

class MyException(cause: ArrayIndexOutOfBoundsException): RuntimeException("Сработало исключение ArrayIndexOutOfBoundsException", cause) {
}