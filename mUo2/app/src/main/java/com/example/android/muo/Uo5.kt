package com.example.android.muo

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_uo5.*


//class Uo5 : AppCompatActivity() {
//    val phoneNumber="7318009709"
//    val REQUEST_PHONE_CALL=1
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_uo5)
//
//        action_call_button.setOnClickListener {
//
//            if(ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE)!=PackageManager.PERMISSION_GRANTED){
//                ActivityCompat.requestPermissions(this,arrayof(Manifest.permission.CALL_PHONE),REQUEST_PHONE_CALL)
//            }else
//            {
//                startcall()
//            }
//
//        }
//    }
//
//    private fun startcall() {
//        val callIntent=Intent(Intent.ACTION_CALL)
//        callIntent.data=Uri.parse("tel:"+phoneNumber)
//        startActivity(callIntent)
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        if(requestCode==REQUEST_PHONE_CALL)startcall()
//    }
//}