package com.example.baeyongpyo.chattingfriebase.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.baeyongpyo.chattingfriebase.DB.ChatDB
import com.example.baeyongpyo.chattingfriebase.R
import com.example.baeyongpyo.chattingfriebase.Util.fireBaseWrite
import com.example.baeyongpyo.chattingfriebase.Util.getCategoryName
import kotlinx.android.synthetic.main.fragment_chat_write.*

class SendFragment : Fragment(){

    var category = getCategoryName()
    var userId = String()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chat_write, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        firebase_wirte_button.setOnClickListener {
            val editText = firebase_wirte_edit.text.toString()
            fireBaseWrite(category, ChatDB(user = userId, message = editText))
        }
    }
}