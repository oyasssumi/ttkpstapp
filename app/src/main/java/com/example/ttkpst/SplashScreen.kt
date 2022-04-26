package com.example.ttkpst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.ActionBar


class SplashScreen : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen_activity)


        val timer = object: CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                val intent = Intent(this@SplashScreen,LoginScreen::class.java)
                startActivity(intent)

            }
        }
        timer.start()



    }
}