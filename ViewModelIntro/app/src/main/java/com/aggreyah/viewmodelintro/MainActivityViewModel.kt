package com.aggreyah.viewmodelintro

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var number = 0
    fun addOne() = number++
}