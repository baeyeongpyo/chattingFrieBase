package com.example.baeyongpyo.chattingfriebase.adapter

import android.support.annotation.IdRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.baeyongpyo.chattingfriebase.DB.ChatDB
import com.example.baeyongpyo.chattingfriebase.R

class FireBaseReceiveListAdapter : RecyclerView.Adapter<ViewHolder>(){

    val dataList = arrayListOf<ChatDB>()

    fun addData(data : ChatDB) {
        dataList.add(data)
        notifyDataSetChanged()
    }

    fun AllData(datas : List<ChatDB>) {
        dataList.clear()
        dataList.addAll(datas)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_chat_list_item, parent, false))

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val getdata = dataList[position]
        holder.run {
            userTextView.text = getdata.user
            msgTextView.text = getdata.message
            timeTextview.text = getdata.getTimeInfo()
        }
    }
}

class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
    val userTextView : TextView = view.findview(R.id.firebase_receive_user_id)
    val msgTextView : TextView = view.findview(R.id.firebase_receive_msg)
    val timeTextview : TextView = view.findview(R.id.firebase_receive_time)

    private fun View.findview(@IdRes Id : Int) = findViewById<TextView>(Id)
}