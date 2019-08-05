package com.example.codetestingexample

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class MainViewModel(private val mathUtil: MathUtil) : BaseObservable() {
    @Bindable
    var inputOne = 0
    @Bindable
    var inputTwo = 0
    @Bindable
    var output = 0

    fun add() {
        output = mathUtil.add(inputOne, inputTwo)
    }

    fun subtract() {}

    fun multiply() {}

    fun divide() {}

    fun factorial() {}
}