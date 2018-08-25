package com.example.baeyongpyo.chattingfriebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        test_buttontextview.setOnClickListener {

            FireBaseWrite("Message", "TEXT")
        }

    }
}
