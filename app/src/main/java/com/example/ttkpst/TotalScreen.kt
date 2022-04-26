package com.example.ttkpst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ttkpst.databinding.TotalScreenActivityBinding

class TotalScreen : AppCompatActivity() {
    lateinit var bindingClass: TotalScreenActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        bindingClass = TotalScreenActivityBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingClass.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включение у тулбара стрелочки назад




            //кнопки
            bindingClass.payBtnTotal
            bindingClass.backMenuBtnTotal



            //toolbar
            bindingClass.historyBtnTotal
            bindingClass.cartBtnTotal
            bindingClass.homeBtnTotal


        //textView для записи результатов оплаты
        bindingClass.textViewForDish
        bindingClass.textViewForTotalPay



    }
}