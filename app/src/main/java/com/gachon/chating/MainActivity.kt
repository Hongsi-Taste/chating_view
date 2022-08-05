package com.gachon.chating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //layout에서 id 연결
        val lv = findViewById<ListView>(R.id.chat)
        val edt = findViewById<EditText>(R.id.edt_txt)
        //어뎁터 선언
        val array : ArrayList<String> = ArrayList<String>()
        val adapter: ArrayAdapter<String> = ArrayAdapter(applicationContext, R.layout.chat_log,array)
        lv.adapter


        //send버튼 동작
        send.setOnClickListener(){
        var txt : String = edt.toString()
            array.add(txt)
            adapter.notifyDataSetChanged()
            edt.setText("")
            Toast.makeText(this,"message sent",Toast.LENGTH_SHORT).show()
        }
    }
}