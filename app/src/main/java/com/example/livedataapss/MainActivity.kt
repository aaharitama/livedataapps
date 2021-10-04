package com.example.livedataapss

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        observe()
        action()
    }

    private fun init() {
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
    }

    private fun observe() {
        viewModel.calcucationValue.observe(this) {
            tvFinalValue.text = it.toString()
        }
    }

    private fun action() {
        btnAction.setOnClickListener {
            viewModel.calculateValue(etFirstValue.text.toString(), etSecondValue.text.toString())
        }
    }
}