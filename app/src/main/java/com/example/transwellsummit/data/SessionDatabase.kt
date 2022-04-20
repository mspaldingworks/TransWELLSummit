package com.example.transwellsummit.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase

@Database(
    entities = [Session::class],
    version = 1,
    exportSchema = false,
)
abstract class SessionDatabase: RoomDatabase() {

    abstract val sessionDatabase: SessionDao


    companion object {
        private var instance: SessionDatabase? = null

        private fun createInstance(context: Context): SessionDatabase {
            val newInstance = databaseBuilder(
                context, SessionDatabase::class.java, "session-db"
            ).build()
            instance = newInstance
            return newInstance


        }

        fun getInstance(context: Context): SessionDatabase {
            return instance ?: createInstance(context)


        }


    }


}
