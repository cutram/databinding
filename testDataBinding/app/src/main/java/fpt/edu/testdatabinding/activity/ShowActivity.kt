package fpt.edu.testdatabinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fpt.edu.testdatabinding.BR
import fpt.edu.testdatabinding.R
import fpt.edu.testdatabinding.databinding.ActivityShowBinding
import fpt.edu.testdatabinding.viewmodel.ShowViewModel

class ShowActivity : AppCompatActivity() {
    lateinit var  binding : ActivityShowBinding
    private val showViewModel = ShowViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_show)
        binding.setVariable(BR.showViewModel, showViewModel)
        showViewModel.onCreate()
    }
}