package com.example.transwellsummit.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.transwellsummit.data.SessionDatabase
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
 class SessionFragmentTest : ViewModel() {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun init(){
        hiltRule.inject()
    }
    @Before
    fun setUp(db: SessionDatabase) {
        viewModelScope
    }

    @Test
    fun readAllData(): Unit = runBlocking{
        viewModelScope
    }

}


