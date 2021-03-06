package com.example.baeyongpyo.chattingfriebase.Util

import com.example.baeyongpyo.chattingfriebase.DB.ChatDB
import com.google.firebase.database.FirebaseDatabase

fun fireBaseWrite(category: String, message: ChatDB) = FirebaseDatabase.getInstance().let {
    it.getReference(category).push().run {
        child("user").setValue(message.user)
        child("message").setValue(message.message)
        child("time").setValue(message.time)
    }
}

fun getCategoryName() : String = "Message"

