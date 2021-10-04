package com.example.livedataapss

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private val _calcucationValue = MutableLiveData<Int>()
    val calcucationValue: LiveData<Int> get() = _calcucationValue

    fun calculateValue(firstValue: String, secondValue: String) {
        val firstVal: Int = if (firstValue.isEmpty()) 0 else firstValue.toInt()
        val secondVal: Int = if (secondValue.isEmpty()) 0 else secondValue.toInt()
        _calcucationValue.value = firstVal + secondVal
    }
}