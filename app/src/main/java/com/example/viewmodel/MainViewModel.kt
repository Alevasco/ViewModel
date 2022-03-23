package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var numero = MutableLiveData<Int>()
    var textResult = MutableLiveData<String>()


}