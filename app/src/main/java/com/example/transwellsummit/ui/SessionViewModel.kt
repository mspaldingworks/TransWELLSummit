import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.transwellsummit.data.Session
import com.example.transwellsummit.data.SessionDao
import com.example.transwellsummit.ui.SessionFragment
import dagger.hilt.android.lifecycle.HiltViewModel
import java.sql.DatabaseMetaData
import javax.inject.Inject

@HiltViewModel
class SessionViewModel @Inject constructor(
    dao: SessionDao
) : ViewModel() {

    val sessions = dao.readAllData().asLiveData(viewModelScope.coroutineContext)
}

