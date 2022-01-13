package com.example.transwellsummit.data

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideSessionDatabase(@ApplicationContext context: Context):SessionDatabase{
        return SessionDatabase.getInstance(context)

    }
    @Provides
    @Singleton
    fun provideSessionDao(db:SessionDatabase): SessionDao {
        return db.sessionDatabase
    }
}