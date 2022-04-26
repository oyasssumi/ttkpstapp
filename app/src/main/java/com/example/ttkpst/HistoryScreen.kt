package com.example.ttkpst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ttkpst.databinding.HistoryScreenActivityBinding

class HistoryScreen : AppCompatActivity() {
    lateinit var bindingClass: HistoryScreenActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = HistoryScreenActivityBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включение у тулбара стрелочки назад
        setContentView(bindingClass.root)



        //ТекстВью для истории
        bindingClass.textForHistory

        //Кнопка назад
        bindingClass.backMenuBtnHistory


        //toolbar
        bindingClass.historyBtnHistory
        bindingClass.homeBtnHistory
        bindingClass.cartBtnHistory



    }
}