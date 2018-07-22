package com.example.rk00486408.practise_application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_form.*
import org.w3c.dom.Text

class formActivity2 : AppCompatActivity() {

    lateinit var rg_toss: RadioGroup

    lateinit var rb_heads: RadioButton

    lateinit var rb_tails: RadioButton

    lateinit var bt_toss: Button

    lateinit var tv_result: TextView

    var count = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form2)

        rg_toss = findViewById(R.id.rg_toss) as RadioGroup

        rb_heads = findViewById(R.id.rb_heads) as RadioButton

        rb_tails = findViewById(R.id.rb_tails) as RadioButton

        bt_toss = findViewById(R.id.bt_toss) as Button

        tv_result = findViewById(R.id.tv_result) as TextView

        tv_result.text = "Hello Brother Again"

        rg_toss.setOnClickListener(View.OnClickListener {
            println("Something is cliked here")
        })

//        rg_toss.setOnCheckedChangeListener()

    }
}
