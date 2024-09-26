import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _count = MutableLiveData<Int>(0)
    val count: LiveData<Int> = _count

    fun increaseCount() {
        _count.value = _count.value?.plus(10)
    }
}
