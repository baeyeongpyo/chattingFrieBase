package com.example.baeyongpyo.chattingfriebase

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

fun AppCompatActivity.replace(@IdRes frameId : Int, fragment : Fragment, tag : String? = null){
    supportFragmentManager
            .beginTransaction()
            .replace(frameId, fragment, tag)
            .commit()
}

fun getNowDateInfo() : String = SimpleDateFormat("YY_MM_dd HH:mm:ss").format(Date(System.currentTimeMillis()))