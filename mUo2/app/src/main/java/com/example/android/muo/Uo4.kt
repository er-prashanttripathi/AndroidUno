package com.example.android.muo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.delay

class Uo4 : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uo4)
        handler=Handler()
        handler.postDelayed(Runnable{
            val intent=Intent(this,Uo6::class.java)
            startActivity(intent)
            finish()
        },2000)

    }
}