package com.example.rk00486408.practise_application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var text_view_1: TextView
    lateinit var text_view_2: TextView
    lateinit var switch1: Switch
    lateinit var radio_1: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_view_1 = findViewById(R.id.text_view_1) as TextView

        text_view_1.text = "Welcome the first application by rhythm and this will pave way for a better appication in future"
//        text_view_1.setSingleLine()
        text_view_1.ellipsize = TextUtils.TruncateAt.MARQUEE
        text_view_1.marqueeRepeatLimit = 10
        text_view_1.isSelected = true



        text_view_2 = findViewById(R.id.text_view_2) as TextView
//        println("the object text_view_2 is = " + text_view_2)
        text_view_2.text = "This will be fun and the text value is changes"
        text_view_2.ellipsize = TextUtils.TruncateAt.MARQUEE
        text_view_2.marqueeRepeatLimit = 10
        text_view_2.isSelected = true
        println("this works and the text view elements are shown")


        switch1 = findViewById(R.id.switch1) as Switch
        switch1.text = "switch _1"
//        println("this is the working of the app")

//        while(true){
//        if (switch1.isChecked()){
//            println("The switch is checked")
//        } else {
//            println("The switch unchecked")
//        }
//        }
        switch1.textOn = "yess"
        switch1.textOff = "noo"
//        switch1.setOnCheckedChangeListener(
////                println("it is checked")
//
//        )
    }
}
