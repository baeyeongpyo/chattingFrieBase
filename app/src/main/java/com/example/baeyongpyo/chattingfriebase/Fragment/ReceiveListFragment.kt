package com.example.baeyongpyo.chattingfriebase.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.baeyongpyo.chattingfriebase.R
import com.example.baeyongpyo.chattingfriebase.adapter.FireBaseReceiveListAdapter
import kotlinx.android.synthetic.main.fragment_chat_list.*

class ReceiveListFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chat_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        firebase_chat_data_rv.adapter = FireBaseReceiveListAdapter()

    }
}