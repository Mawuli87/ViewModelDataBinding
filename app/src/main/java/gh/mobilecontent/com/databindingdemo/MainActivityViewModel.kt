package gh.mobilecontent.com.databindingdemo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal:Int): ViewModel() {

    private var _total = MutableLiveData<Int>()
    val total : LiveData<Int>
        get() = _total


    val inputText = MutableLiveData<String>()

    init {
        _total.value = startingTotal
    }

    fun setTotal(){
        val intInput : Int = inputText.value!!.toInt()
        _total.value =(total.value)?.plus(intInput)
    }

    fun justCalculate(){
        _total.value = inputText.value!!.toInt()
    }

}