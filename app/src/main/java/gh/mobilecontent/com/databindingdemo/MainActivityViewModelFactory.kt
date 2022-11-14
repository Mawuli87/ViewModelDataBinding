package gh.mobilecontent.com.databindingdemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

//class MainActivityViewModelFactory(private val startingTotal : Int) : ViewModelProvider.Factory{
//
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
//            return MainActivityViewModel(startingTotal) as T
//        }
//        throw IllegalArgumentException("Unknown View Model Class")
//    }
//
//
//}

class MainActivityViewModelFactory(startingTotal:Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainActivityViewModel(45) as T
    }

}