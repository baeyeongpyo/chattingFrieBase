package com.example.baeyongpyo.chattingfriebase

import com.google.firebase.database.FirebaseDatabase

fun fireBaseWrite(category : String, message : String) = FirebaseDatabase.getInstance().let { it.getReference(category).setValue(message) }