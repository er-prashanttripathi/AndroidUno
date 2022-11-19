package com.example.android.muo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_uo2.*

class Uo2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uo2)
        button2.setOnClickListener {
            startActivity(Intent(this@Uo2,Uo3::class.java))
        }
    }
}