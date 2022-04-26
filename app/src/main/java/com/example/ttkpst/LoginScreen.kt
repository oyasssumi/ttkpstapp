package com.example.ttkpst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ttkpst.databinding.LoginScreenActivityBinding

class LoginScreen : AppCompatActivity() {
    lateinit var bindingClass: LoginScreenActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = LoginScreenActivityBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включение у тулбара стрелочки назад
        setContentView(bindingClass.root)

        //Edit text поля
        bindingClass.email
        bindingClass.password

        bindingClass.textLink // ссылка в Забыли пароль(должна переносить в signUp)

        //кнопки
        bindingClass.login
        bindingClass.signup

        //toolbar
        bindingClass.homeBtn
        bindingClass.historyBtn
        bindingClass.cartBtn






    }
}