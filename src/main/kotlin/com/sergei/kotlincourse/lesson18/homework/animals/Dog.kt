package com.sergei.kotlincourse.lesson18.homework.animals

import com.sergei.com.sergei.kotlincourse.com.sergei.kotlincourse.lesson18.printColored

class Dog : AnimalsAndTheirSounds() {
    override fun makeSound(sound: String) {
        printColored("Bark", Colors.BLUE)

    }
}
