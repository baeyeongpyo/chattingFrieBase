package com.example.baeyongpyo.chattingfriebase.Util

import android.content.Context
import com.example.baeyongpyo.chattingfriebase.DB.ChatDB
import com.example.baeyongpyo.chattingfriebase.MainActivity
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError

class FireBaseAddMessage(val context : Context) : ChildEventListener {

    val activity = (context as MainActivity)

    val chatDataList = arrayListOf<ChatDB>()

    private fun DataSnapshot.chageChatData() = this.getValue(ChatDB::class.java)?.apply { fireBaseKey = key }

    override fun onCancelled(p0: DatabaseError) {}

    override fun onChildMoved(p0: DataSnapshot, p1: String?) {}

    override fun onChildChanged(p0: DataSnapshot, p1: String?) {
        p0.chageChatData()?.let { chatDataList.add(it); activity.receiveData(it) }
    }

    override fun onChildAdded(p0: DataSnapshot, p1: String?) {
        p0.chageChatData()?.let { chatDataList.add(it); activity.receiveData(it) }
    }

    override fun onChildRemoved(p0: DataSnapshot) {}
}