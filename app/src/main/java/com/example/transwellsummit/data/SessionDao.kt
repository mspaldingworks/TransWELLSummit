package com.example.transwellsummit.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface SessionDao {

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData(): Flow<List<Session>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addSessionToItinerary(session: Session)
    
}