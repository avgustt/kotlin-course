package com.sergei.kotlincourse.lesson18.homework.animals

class Bird : AnimalsAndTheirSounds () {
    override fun makeSound(sound: String) {
        printColored("Tweet", Colors.CYAN)
    }
}