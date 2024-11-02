package com.sergei.kotlincourse.lesson18.homework.animals

class Cat : AnimalsAndTheirSounds () {
    override fun makeSound(sound: String) {
        printColored("Meow", Colors.BLACK)
    }

}