package com.example.baeyongpyo.chattingfriebase


data class ChatDB(val fireBaseKey : String,
                  val user : String,
                  val message : String,
                  val time : String = getNowDateInfo()
                  ) {
}