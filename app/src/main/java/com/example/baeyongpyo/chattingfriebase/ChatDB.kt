package com.example.baeyongpyo.chattingfriebase


data class ChatDB(var fireBaseKey : String? = null,
                  val user : String = String(),
                  val message : String = String(),
                  val time : String = getNowDateInfo()
                  )