package com.example.baeyongpyo.chattingfriebase

import com.google.firebase.database.FirebaseDatabase

fun FireBaseWrite(category : String, message : String){
    FirebaseDatabase.getInstance().let {
        it.getReference(category).let{
            it.setValue(message)
        }
    }
}