package com.example.baeyongpyo.chattingfriebase

import android.util.Log
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError

class FireBaseAddMessage : ChildEventListener {

    override fun onCancelled(p0: DatabaseError) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onChildMoved(p0: DataSnapshot, p1: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onChildChanged(p0: DataSnapshot, p1: String?) {
        val sendDataForm = p0.getValue(ChatDB::class.java)
        sendDataForm?.fireBaseKey

    }

    override fun onChildAdded(p0: DataSnapshot, p1: String?) {
        val keydata = p0.key
        Log.i("TESTSETSETS", keydata + "ABCD")
    }

    override fun onChildRemoved(p0: DataSnapshot) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}