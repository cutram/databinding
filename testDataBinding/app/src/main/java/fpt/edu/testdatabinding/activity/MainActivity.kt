package fpt.edu.testdatabinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fpt.edu.testdatabinding.BR
import fpt.edu.testdatabinding.R
import fpt.edu.testdatabinding.databinding.ActivityMainBinding
import fpt.edu.testdatabinding.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var model = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.setVariable(BR.viewModel, model)
        model.onCreate()
    }

}