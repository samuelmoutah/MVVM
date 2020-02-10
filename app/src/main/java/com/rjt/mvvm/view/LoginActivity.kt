package com.rjt.mvvm.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.rjt.mvvm.R
import com.rjt.mvvm.model.User
import com.rjt.mvvm.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_clcik

/**
 * Model: abstracts the data source. The ViewModel works with the DataModel to get and save the data.
 *
 * ViewModel: exposes streams of data relevant to the View
 *
 * View: that informs the ViewModel about the user’s actions
 */

/**
 * Epic: Students data class - id , name , address. Show the data into Second activity
 *
 * 1st. User Story:
 *      create data class which properties are id, name, address.       >> Model | User(id, name, address)
 *
 * 2nd. User Story:
 *      create LoginViewModel                                           >> ViewModel
 *
 * 3rd. User Story:
 *      create LoginActivity                                            >> View
 *
 * 4th. User Story:
 *      create SecondActivity
 *          i. display name and address in the textview
 *              + how to send/get data? >> Using Intent from DemoActivity to SecondActivity
 *
 */

class LoginActivity : AppCompatActivity() {

    // this is instance variable

    // declaring instance of User class
    lateinit var myUser: User

    // declaring instance of LoginViewModel class
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Providing(or accessing) ViewModel using ViewModelProviders
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)


        // Synthetic binding
        btn_clcik.setOnClickListener {
            // Observe Data Changes
            var id = edit_text_id.text.toString().toInt()
            var name = edit_text_name.text.toString()
            var address = edit_text_address.text.toString()

            // Create instance of User class

            myUser = User(
                // Named Parameters
                name = name,
                address = address,
                id = id)


            // Passing myUser as argument to getUser method
            var data = loginViewModel.getUser(myUser)

            // Creating intent instance of Intent class
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", data.name)
            intent.putExtra("address", data.address)
            startActivity(intent)




        }
    }
}
