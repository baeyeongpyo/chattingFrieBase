package com.example.baeyongpyo.chattingfriebase.Util

import android.content.Context
import com.example.baeyongpyo.chattingfriebase.DB.ChatDB
import com.example.baeyongpyo.chattingfriebase.MainActivity
import com.example.baeyongpyo.chattingfriebase.adapter.FireBaseReceiveListAdapter
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import kotlinx.android.synthetic.main.fragment_chat_list.*

class FireBaseAddMessage(context : Context) : ChildEventListener {

    private val activity = (context as MainActivity)

    private fun DataSnapshot.chageChatData() = this.getValue(ChatDB::class.java)?.apply { fireBaseKey = key }

    override fun onCancelled(p0: DatabaseError) {}

    override fun onChildMoved(p0: DataSnapshot, p1: String?) {}

    override fun onChildChanged(p0: DataSnapshot, p1: String?) {
        p0.chageChatData()?.let {
            activity.receiveData(it)
            with(activity){ firebase_chat_data_rv.scrollToPosition((firebase_chat_data_rv.adapter as FireBaseReceiveListAdapter).dataList.lastIndex) }
        }
    }

    override fun onChildAdded(p0: DataSnapshot, p1: String?) {
        p0.chageChatData()?.let {
            activity.receiveData(it)
        }
    }

    override fun onChildRemoved(p0: DataSnapshot) {}
}