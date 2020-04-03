package com.example.facegen.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.facegen.R
import com.example.facegen.util.Constants
import com.example.facegen.view.fragment.BotInputFragment
import com.example.facegen.view.fragment.TextInputFragment

class InputActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        var inputType = intent.getStringExtra("inputType")

        var fragmentTransaction = supportFragmentManager.beginTransaction()
        if (inputType == Constants.TEXT_INPUT) {
            fragmentTransaction.replace(R.id.frame_layout, TextInputFragment()).commit()
        } else {
            fragmentTransaction.replace(R.id.frame_layout, BotInputFragment()).commit()
        }
    }
}
