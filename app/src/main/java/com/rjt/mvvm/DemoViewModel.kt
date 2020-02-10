package com.rjt.mvvm

import androidx.lifecycle.ViewModel

class DemoViewModel: ViewModel() {

    fun getMessage(message: Message): String{

        // String Template
        return "${message.message} ${message.password}"
    }
}