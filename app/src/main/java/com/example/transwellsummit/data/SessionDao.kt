package com.example.transwellsummit.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SessionDao {

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData(): Flow<List<Session>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addSessionToItinerary(session: Session)

}