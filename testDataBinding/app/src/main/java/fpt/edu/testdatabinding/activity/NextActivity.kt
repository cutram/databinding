package fpt.edu.testdatabinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fpt.edu.testdatabinding.BR
import fpt.edu.testdatabinding.R
import fpt.edu.testdatabinding.databinding.ActivityNextBinding
import fpt.edu.testdatabinding.viewmodel.NextViewModel


class NextActivity : AppCompatActivity() {
    lateinit var binding: ActivityNextBinding
    private var viewModel = NextViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_next)
        binding.setVariable(BR.viewModel, viewModel)


    }
}