package com.example.livedataapss

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var calcucationValue = MutableLiveData<Int>()

    fun calculateValue(firstValue: String, secondValue: String) {
        val firstVal: Int = if (firstValue.isEmpty()) 0 else firstValue.toInt()
        val secondVal: Int = if (secondValue.isEmpty()) 0 else secondValue.toInt()
        calcucationValue.value = firstVal + secondVal
    }
}