package com.rjt.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rjt.mvvm.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var name = intent.getStringExtra("name")
        var address = intent.getStringExtra("address")

        edit_text_name.setText(name)
        edit_text_address.setText(address)
    }
}
