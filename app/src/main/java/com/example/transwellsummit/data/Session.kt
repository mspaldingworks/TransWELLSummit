package com.example.transwellsummit.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class Session(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val presenter: String,
    val room: Int,
    val favorite: Boolean,
)