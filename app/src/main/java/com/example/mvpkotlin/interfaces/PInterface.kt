package com.example.mvpkotlin.interfaces

interface PInterface {


    interface DataView {

        fun initView()      //innitialise
        fun updateView()
    }
    interface Presenter{

        fun incrementValue()
        fun getCounter(): String

    }
    interface DataModel {

        fun incrementCounter()
        fun getCounter(): Int

    }
}