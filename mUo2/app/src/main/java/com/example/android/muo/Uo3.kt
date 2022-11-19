package com.example.android.muo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_uo2.*
import kotlinx.android.synthetic.main.activity_uo3.*

class Uo3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uo3)
        button3.setOnClickListener {
            startActivity(Intent(this@Uo3, Uo4::class.java))//Uo4::class.java
        }
    }
}