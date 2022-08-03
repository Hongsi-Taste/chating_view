package com.gachon.chating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //layout에서 id 가져와서 연결
        val lv = findViewById<ListView>(R.id.chat)
        val edt = findViewById<EditText>(R.id.edt_txt)
        //send버튼 동작
        send.setOnClickListener(){

        }

    }
}