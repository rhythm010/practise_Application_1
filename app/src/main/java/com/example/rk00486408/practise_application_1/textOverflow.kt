package com.example.rk00486408.practise_application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class textOverflow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_overflow)

        var tv_1 = findViewById<TextView>(R.id.tv_1) as TextView

        tv_1.setSingleLine()
        tv_1.isSelected
        tv_1.text = "https://www.youtube.com/watch?v=nQHnUADO0ds&list=PLCH0RJhrZ8JJa2ik8D_JdLhIj9dwppH2g&index=19https://www.youtube.com/watch?v=nQHnUADO0ds&list=PLCH0RJhrZ8JJa2ik8D_JdLhIj9dwppH2g&index=19"

    }
}
