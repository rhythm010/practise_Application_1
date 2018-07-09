package com.example.rk00486408.practise_application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_edit_text2.*
import org.w3c.dom.Text


class EditTextActivity : AppCompatActivity() {

    lateinit var edittext1: EditText

    lateinit var edittext2: EditText

    lateinit var tv_result: TextView
    lateinit var tv_final: TextView
    lateinit var tv_header: TextView

    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text2)

        tv_result = findViewById(R.id.tv_result) as TextView


        edittext1 = findViewById(R.id.et_1) as EditText
        edittext2 = findViewById(R.id.et_2) as EditText

        tv_result = findViewById(R.id.tv_result) as TextView
        tv_final = findViewById(R.id.tv_final) as TextView
        tv_header = findViewById(R.id.tv_header) as TextView

        btn = findViewById(R.id.btn) as Button

        btn.setOnClickListener({

            //            println("The Button has been clicked")
//            tv_result.text = if (edittext.text != null && edittext.text.length > 0) {
//                edittext.text
//            } else {
//                "Type something in the box"
//            }
//            if(edittext1.text == edittext2.text){
//                tv_final.text  =  "Yes, this works like a charm"
//            } else {
//                tv
//            }
            var str1 = edittext1.text.toString()

            var str2 = edittext2.text.toString()
//
//            println(edittext1.text)
//            println(edittext2.text)

            tv_header.text = if (str1.equals(str2)) {
                "Matches"
            } else {
                "Not Matching"
            }

        })

        // the code for onedit change listener

        edittext2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
//                btn.text = "btn changed"
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var str1 = edittext1.text.toString()

                var str2 = edittext2.text.toString()
//
//            println(edittext1.text)
//            println(edittext2.text)

                tv_header.text = if (str1.equals(str2)) {
                    "Matches"
                } else {
                    "Not Matching"
                }
            }

        })


        edittext1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
//                btn.text = "btn changed"
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var str1 = edittext1.text.toString()

                var str2 = edittext2.text.toString()
//
//            println(edittext1.text)
//            println(edittext2.text)

                tv_header.text = if (str1.equals(str2)) {
                    "Matching Now"
                } else {
                    "Not Matching"
                }
            }

        })

    }
}
