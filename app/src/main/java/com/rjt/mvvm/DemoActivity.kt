package com.rjt.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Model:
 *
 * ViewModel:
 *
 * View:
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

class DemoActivity : AppCompatActivity() {

    // An instance var
    // declaring instance of Message class
//    var myMessage: Message? = null

    // If lateinit var is not initialized, it will not throw KotlinNullPointerException (Your app still running)
    // Disadvantage here is: you don't know what's going on with the code.
//    lateinit var myMessage: Message
//
//    lateinit var loginViewModel: DemoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Why do we need ViewModelProviders, when DemoViewModel() initialization still working just fine???
//        loginViewModel = DemoViewModel()
        //ViewModelProviders - returning view model class
//        loginViewModel = ViewModelProviders.of(this).get(DemoViewModel::class.java)
//
//        btn_clcik.setOnClickListener {
//
//            // Create/Initialize an instance/object of Message class
//            myMessage = Message(edit_text.text.toString(), edit_text_pw.text.toString())
//
//            //passing myMessage as argument to getMessage method.
//            var data = loginViewModel.getMessage(myMessage)
//
//            Toast.makeText(applicationContext, data, Toast.LENGTH_SHORT).show()
//        }
    }
}
