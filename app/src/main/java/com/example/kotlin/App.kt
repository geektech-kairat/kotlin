package com.example.kotlin

import android.app.Application
import android.arch.persistence.room.Room
import com.example.kotlin.room.DataBase

class App : Application() {
    lateinit var instance: App
    lateinit var dateBase: DataBase

    override fun onCreate() {
        super.onCreate()
        instance = this
        dateBase = Room.databaseBuilder(applicationContext, DataBase::class.java, "")
            .allowMainThreadQueries().build()
    }
}