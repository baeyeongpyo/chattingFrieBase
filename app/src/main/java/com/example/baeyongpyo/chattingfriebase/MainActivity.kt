package com.example.baeyongpyo.chattingfriebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {

    val TAG = "FireBase"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        replace(R.id.fragment_send_layout, SendFragment().apply { category = "Message" })

        FirebaseDatabase.getInstance().getReference("Message").key

        val getvalue : (DataSnapshot)-> Unit = { Log.i(TAG, it.getValue(String::class.java))}
        val getErr : (DatabaseError)-> Unit = { Log.w(TAG, it.toException())}

        FirebaseDatabase.getInstance().getReference("Message").addChildEventListener(FireBaseAddMessage())

        FirebaseDatabase.getInstance().getReference("Message").addValueEventListener(
                object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {
//                        Log.w(TAG, p0.toException())
                    }

                    override fun onDataChange(p0: DataSnapshot) {
//                        Log.i(TAG, p0.getValue(String::class.java))

                    }
                })

    }


}
