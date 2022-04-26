package com.example.ttkpst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ttkpst.databinding.CartScreenActivityBinding

class CartScreen : AppCompatActivity() {

    lateinit var bindingClass: CartScreenActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = CartScreenActivityBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включение у тулбара стрелочку назад
        setContentView(bindingClass.root)

        //Отбивные
        bindingClass.chopMinusBtn
        bindingClass.chopNumEditText
        bindingClass.chopPlusBtn


        //Борщ
        bindingClass.borschMinusBtn
        bindingClass.borschNumEditText
        bindingClass.botschPlusBtn

        //toolbar
        bindingClass.homeBtnCart
        bindingClass.cartBtnCart
        bindingClass.historyBtnCart


    }
}