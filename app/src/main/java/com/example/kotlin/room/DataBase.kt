package com.example.kotlin.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import com.example.kotlin.ui.home.adapter.HomeModel

@Database(entities = [HomeModel::class], version = 1, exportSchema = false)
abstract class DataBase  : RoomDatabase() {
    abstract fun dao():Dao
}