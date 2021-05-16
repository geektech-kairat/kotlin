package com.example.kotlin.ui.home.adapter

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.lang.reflect.Constructor

@Entity
data class HomeModel (
    @PrimaryKey(autoGenerate = true)
    var id :Int,
    var title :String,
    var deck:String,
    var date:String,
    var editDate:String
    ){
    constructor() : this("", emptyList(),
        "", emptyList(), -1,
        "", "", hashMapOf<Any, Any>(),
        -1, LinkedTreeMap<Any, Any>()
    )
}


