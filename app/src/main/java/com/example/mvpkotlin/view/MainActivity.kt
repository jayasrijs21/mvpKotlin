package com.example.mvpkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mvpkotlin.R
import com.example.mvpkotlin.interfaces.PInterface
import com.example.mvpkotlin.presenter.MainActivityPresenter



class MainActivity : AppCompatActivity() , PInterface.DataView {



    var display: TextView ?=null
    var click: Button ?= null



    private var presenter: MainActivityPresenter? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display = findViewById<TextView>(R.id.result)
        click = findViewById<Button>(R.id.btnInc)


        presenter = MainActivityPresenter(this)


    }

    override fun initView() {

        display?.text = presenter?.getCounter()
        click?.setOnClickListener { presenter?.incrementValue() }



    }

    override fun updateView() {
        display?.text = presenter?.getCounter()

    }
}