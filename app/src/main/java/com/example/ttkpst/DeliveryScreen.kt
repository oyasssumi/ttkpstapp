package com.example.ttkpst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ttkpst.databinding.DeliveryScreenActivityBinding



class DeliveryScreen : AppCompatActivity() {
    lateinit var bindingClass: DeliveryScreenActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = DeliveryScreenActivityBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включение у тулбара стрелочки назад
        setContentView(bindingClass.root)


        //Edit Text'ы
        bindingClass.editTextTextHome
        bindingClass.editTextTextFlat  //кв
        bindingClass.editTextTextEntarance // подъезд


        //кнопки
        bindingClass.backMenuBtnDel
        bindingClass.backToCartBtn
        bindingClass.payBtn


        //Заберу сам чекбокс
        bindingClass.checkBoxDel


        //toolbar
        bindingClass.homeBtnDel
        bindingClass.cartBtnDel
        bindingClass.historyBtnDel



    }
}