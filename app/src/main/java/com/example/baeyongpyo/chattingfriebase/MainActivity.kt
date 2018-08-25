package com.example.baeyongpyo.chattingfriebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replace(R.id.fragment_send_layout, SendFragment().apply { userId = "testUser"})

        FirebaseDatabase.getInstance().getReference(getCategoryName()).addChildEventListener(FireBaseAddMessage())

    }


}
