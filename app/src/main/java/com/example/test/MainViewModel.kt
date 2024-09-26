import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _count = MutableStateFlow(0)
    val count = _count.asStateFlow()

    fun increaseCount() {
        _count.value += 10
    }
}
