package com.example.baeyongpyo.chattingfriebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        replace(R.id.fragment_send_layout, SendFragment().apply { category = "Message" })

    }
}
