package com.example.ttkpst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.ttkpst.databinding.SignUpScreenActivityBinding


class SignUpScreen : AppCompatActivity() {
    lateinit var bindingClass: SignUpScreenActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = SignUpScreenActivityBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включение у тулбара стрелочки назад
        setContentView(bindingClass.root)


        //Edit text
        bindingClass.emailSignUp
        bindingClass.passwordSignUp


        bindingClass.signupSignup // кнопка SignUp

        //toolbar

        bindingClass.cartBtnSignUp
        bindingClass.homeBtnSignUp
        bindingClass.historyBtnSignUp



    }
}