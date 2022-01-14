package com.example.transwellsummit.ui


import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.transwellsummit.data.SessionDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SessionViewModel @Inject constructor(
    dao: SessionDao
) : ViewModel() {

    val sessions = dao.readAllData().asLiveData(viewModelScope.coroutineContext)

}

