package com.example.climacast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.btn_1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnLogicListener()

    }

//    private fun btnLogicListener(){
//        btn_1.setOnClickListener(){
//            startActivity(Intent(this, LocActivity::class.java))
//        }
//    }

//    private lateinit var myButton: Button
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        myButton = findViewById(R.id.btn_1)
//        myButton.setOnClickListener {
//            startActivity(Intent(this, LocActivity::class.java))
////        }
//        }
//    }
}