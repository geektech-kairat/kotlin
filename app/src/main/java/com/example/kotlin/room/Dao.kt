package com.example.kotlin.room

import android.arch.persistence.room.*
import android.arch.persistence.room.Dao
import androidx.lifecycle.LiveData
import com.example.kotlin.ui.home.adapter.HomeModel

@Dao
interface Dao {
    @Insert
    fun insert(homeModel: HomeModel?)

    @Update
    fun update(homeModel: HomeModel?)

    @Delete
    fun delete(homeModel: HomeModel?)

    @Query("SELECT * FROM homeModel")
    fun getAll(): LiveData<List<HomeModel?>?>?

    @Query("SELECT * FROM homeModel ORDER by title ASC")
    fun getAllBySort(): List<HomeModel?>?

    @Query("SELECT * FROM homeModel ORDER by title DESC")
    fun getAllBySortRes(): List<HomeModel?>?

    @Query("DELETE FROM homeModel")
    fun deleteAll()
}