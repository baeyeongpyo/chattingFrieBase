package com.example.baeyongpyo.chattingfriebase.DB

import com.example.baeyongpyo.chattingfriebase.Util.chageDateToTime
import com.example.baeyongpyo.chattingfriebase.Util.getNowDateInfo


data class ChatDB(var fireBaseKey : String? = null,
                  val user : String = String(),
                  val message : String = String(),
                  val time : String = getNowDateInfo()
                  ){
    fun getTimeInfo() : String = chageDateToTime(time)
}
