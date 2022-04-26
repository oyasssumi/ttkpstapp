package com.example.ttkpst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ttkpst.databinding.MainMenuActivityBinding


class MainMenuScreen : AppCompatActivity() {

    lateinit var bindingClass: MainMenuActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = MainMenuActivityBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включение у тулбара стрелочки назад
        setContentView(bindingClass.root)


        //кнопки магазина
        bindingClass.borschBtnBuy
        bindingClass.borschBtnCart

        bindingClass.chickenBtnCart
        bindingClass.chickenBtnBuy

        bindingClass.chopBtnBuy
        bindingClass.chickenBtnCart

        bindingClass.freeBtnBuy
        bindingClass.freeBtnCart


        //тулбар
        bindingClass.homeBtnMain
        bindingClass.cartBtnMain
        bindingClass.historyBtnMain



    }
}