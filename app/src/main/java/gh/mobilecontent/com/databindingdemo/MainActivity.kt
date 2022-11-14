package gh.mobilecontent.com.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import gh.mobilecontent.com.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(120)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainActivityViewModel::class.java]
        binding.mainViewModel = viewModel
       binding.lifecycleOwner = this




    }


}