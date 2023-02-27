package com.example.mvpkotlin.presenter

import com.example.mvpkotlin.interfaces.PInterface
import com.example.mvpkotlin.model.MainActivityModel

class MainActivityPresenter (view: PInterface.DataView) :PInterface.Presenter {


    private var view: PInterface.DataView = view
    private var model : PInterface.DataModel = MainActivityModel()

    init{
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateView()
    }

    override fun getCounter(): String {
        return model.getCounter().toString()
    }
}