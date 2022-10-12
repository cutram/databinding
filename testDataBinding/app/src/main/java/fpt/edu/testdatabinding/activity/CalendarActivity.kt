package fpt.edu.testdatabinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fpt.edu.testdatabinding.BR
import fpt.edu.testdatabinding.R
import fpt.edu.testdatabinding.databinding.ActivityCalendarBinding
import fpt.edu.testdatabinding.viewmodel.CalendarViewModel

class CalendarActivity : AppCompatActivity() {
    lateinit var binding : ActivityCalendarBinding
    private val viewModel = CalendarViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_calendar)
        binding.setVariable(BR.viewModel, viewModel)
    }
}