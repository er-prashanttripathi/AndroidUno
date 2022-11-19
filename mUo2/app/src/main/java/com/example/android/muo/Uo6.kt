package com.example.android.muo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_uo6.*

class Uo6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uo6)

        val btndel: Button=findViewById(R.id.btndel)
        val btnndel: Button=findViewById(R.id.btnndel)
        val txtresn: TextView=findViewById(R.id.txtresn)
        val emtxtresn: EditText=findViewById(R.id.emtxtresn)
        val btnsub1: Button=findViewById(R.id.btnsub)
        val btnpaycon: Button=findViewById(R.id.btnpaycon)
        val etxtamtrec: TextView=findViewById(R.id.etxtamtrec)
        val txtamtcol: TextView=findViewById(R.id.txtamtcol)
        val rcash: RadioButton=findViewById(R.id.rcash)
        val rcheque: RadioButton=findViewById(R.id.rcheque)
        val rother: RadioButton=findViewById(R.id.rother)


        btnndel.setOnClickListener (){
            txtresn.setVisibility(View.VISIBLE)
            emtxtresn.setVisibility(View.VISIBLE)
            btnsub1.setVisibility(View.VISIBLE)
            btnpaycon.setVisibility(View.INVISIBLE)
            etxtamtrec.setVisibility(View.INVISIBLE)
            txtamtcol.setVisibility(View.INVISIBLE)
            rcash.setVisibility(View.INVISIBLE)
            rcheque.setVisibility(View.INVISIBLE)
            rother.setVisibility(View.INVISIBLE)
        }
        btndel.setOnClickListener (){
            rcash.setVisibility(View.VISIBLE)
            rcheque.setVisibility(View.VISIBLE)
            rother.setVisibility(View.VISIBLE)
            txtamtcol.setVisibility(View.VISIBLE)
            txtresn.setVisibility(View.INVISIBLE)
            emtxtresn.setVisibility(View.INVISIBLE)
            btnsub1.setVisibility(View.INVISIBLE)

        }
        rcash.setOnClickListener (){
            btnpaycon.setVisibility(View.VISIBLE)
            etxtamtrec.setVisibility(View.VISIBLE)
            etxtchq.setVisibility(View.INVISIBLE)
            btnchq.setVisibility(View.INVISIBLE)
            etxtother.setVisibility(View.INVISIBLE)
            btnother.setVisibility(View.INVISIBLE)
        }
        rcheque.setOnClickListener (){
            etxtchq.setVisibility(View.VISIBLE)
            btnchq.setVisibility(View.VISIBLE)
            btnpaycon.setVisibility(View.INVISIBLE)
            etxtamtrec.setVisibility(View.INVISIBLE)
            etxtother.setVisibility(View.INVISIBLE)
            btnother.setVisibility(View.INVISIBLE)
        }
        rother.setOnClickListener (){
            etxtother.setVisibility(View.VISIBLE)
            btnother.setVisibility(View.VISIBLE)
            btnpaycon.setVisibility(View.INVISIBLE)
            etxtamtrec.setVisibility(View.INVISIBLE)
            etxtchq.setVisibility(View.INVISIBLE)
            btnchq.setVisibility(View.INVISIBLE)
        }

    }
}