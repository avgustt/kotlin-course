package com.sergei.kotlincourse.lesson24

import javax.annotation.processing.Messager

class OrderExeption(messager: String): RuntimeException(messager) {

}

