package com.sergei.kotlincourse.lesson19.homework

open class SlotMachine(

    val color: String,

    val model: String,

    private var switch: Boolean,

    private var osSistem: Boolean,

    val listOfGames: List<String>,

    val controller: Boolean,

    private var balance: Double,

    private var owner: String,

    private var supportPhone: String

) {

    fun ternOn () {
        switch = true
        loadOs()
    }
    fun ternOff () {
        shutDownOsI()
        switch = false
    }

    private fun loadOs () {}

    private fun shutDownOsI() {}

    fun showListOfGames () {}

    fun  turnOnGame () {}

    fun payForGameSession() {}

    fun openSafeGetCash (pin: String) {
        if (pin == "12345") {
            return
        }
    }

    protected fun payToWinner () {}

}