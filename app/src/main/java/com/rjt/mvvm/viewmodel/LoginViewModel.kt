package com.rjt.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.rjt.mvvm.model.User


// Extending ViewModel()
class LoginViewModel: ViewModel() {

    fun getUser(user: User): User {
        return user
    }

//    fun getUserInfo(user: User): String {
//        return "User(${user.address}, ${user.id}, ${user.name})"
//    }
}