package com.example.codetestingexample

import android.text.Editable
import androidx.core.text.isDigitsOnly
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableInt

class MainViewModel(private val mathUtil: MathUtil) : BaseObservable() {

    var inputOne = 0
    var inputTwo = 0
    var output = ObservableInt(0)

    fun add() {
        output.set(mathUtil.add(inputOne, inputTwo))
    }

    fun subtract() {}

    fun multiply() {}

    fun divide() {}

    fun factorial() {}

    @Bindable
    fun setInputOne(text: Editable) {
        val value = text.toString()
        inputOne = if (value.isDigitsOnly() && !value.isBlank()) {
            Integer.valueOf(value)
        } else 0
    }

    @Bindable
    fun setInputTwo(text: Editable) {
        val value = text.toString()
        inputTwo = if (value.isDigitsOnly() && !value.isBlank()) {
            Integer.valueOf(value)
        } else 0
    }
}