package com.example.facegen.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.example.facegen.R
import com.example.facegen.util.Constants

class ChooseActivity : AppCompatActivity() {

    @BindView(R.id.ll_text_input)
    lateinit var linearLayoutTextInput : LinearLayout

    @BindView(R.id.ll_bot_input)
    lateinit var linearLayoutBotInput : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.ll_text_input)
    fun textInputSelected() {
        val intent = Intent(this, InputActivity::class.java)
        intent.putExtra("inputType", Constants.TEXT_INPUT)
        startActivity(intent)
    }

    @OnClick(R.id.ll_bot_input)
    fun botInputSelected() {
        val intent = Intent(this, InputActivity::class.java)
        intent.putExtra("inputType", Constants.BOT_INPUT)
        startActivity(intent)
    }
}
