package com.example.mvpkotlin.model

import com.example.mvpkotlin.interfaces.PInterface

class MainActivityModel : PInterface.DataModel {

    private var counter = 0
    override fun incrementCounter() {
        counter++
    }

    override fun getCounter(): Int {
        return counter
    }
}