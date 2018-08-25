package com.example.baeyongpyo.chattingfriebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.baeyongpyo.chattingfriebase.DB.ChatDB
import com.example.baeyongpyo.chattingfriebase.Fragment.ReceiveListFragment
import com.example.baeyongpyo.chattingfriebase.Fragment.SendFragment
import com.example.baeyongpyo.chattingfriebase.Util.FireBaseAddMessage
import com.example.baeyongpyo.chattingfriebase.Util.getCategoryName
import com.example.baeyongpyo.chattingfriebase.Util.replace
import com.example.baeyongpyo.chattingfriebase.adapter.FireBaseReceiveListAdapter
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.fragment_chat_list.*

class MainActivity : AppCompatActivity() {

    private val receiveFragment = ReceiveListFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replace(R.id.fragment_receive_layout, receiveFragment)
        replace(R.id.fragment_send_layout, SendFragment().apply { userId = "testUser"})

        FirebaseDatabase.getInstance().getReference(getCategoryName()).addChildEventListener(FireBaseAddMessage(this))

    }

    fun receiveData(data : ChatDB) = (receiveFragment.firebase_chat_data_rv.adapter as FireBaseReceiveListAdapter).addData(data)


}
