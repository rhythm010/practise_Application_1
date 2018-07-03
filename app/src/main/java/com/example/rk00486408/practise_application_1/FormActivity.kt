package com.example.rk00486408.practise_application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*

class FormActivity : AppCompatActivity() {

    var moreThanOne: Boolean = false

    lateinit var rg_normal: RadioGroup
    lateinit var rg_different: RadioGroup

    lateinit var rb_male: RadioButton
    lateinit var rb_female: RadioButton
    lateinit var rb_other: RadioButton
    lateinit var rb_diff: RadioButton

    lateinit var cb_footBall: CheckBox
    lateinit var cb_hockey: CheckBox
    lateinit var cb_cricket: CheckBox

    lateinit var tv_sport: TextView
    lateinit var tv_gender: TextView
    lateinit var tv_final_1: TextView
    lateinit var tv_final_2: TextView


    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        rg_normal = findViewById(R.id.radioGroup_normal) as RadioGroup
//        rg_different = findViewById(R.id.radioGroup_different) as RadioGroup

        rb_male = findViewById(R.id.radio_1) as RadioButton
        rb_female = findViewById(R.id.radio_2) as RadioButton
//        rb_other = findViewById(R.id.radio_3) as RadioButton
//        rb_diff = findViewById(R.id.radio_4) as RadioButton


        cb_footBall = findViewById(R.id.cb_footBall) as CheckBox
        cb_hockey = findViewById(R.id.cb_hockey) as CheckBox
        cb_cricket = findViewById(R.id.cb_cricket) as CheckBox


        btn = findViewById(R.id.button)

        tv_gender = findViewById(R.id.tv_gender)
        tv_sport = findViewById(R.id.tv_sport)
        tv_final_1 = findViewById(R.id.tv_final_1)
        tv_final_2 = findViewById(R.id.tv_final_2)



        btn.setOnClickListener(View.OnClickListener {
            var result = ""
            var result_2 = ""
            if (rg_normal.checkedRadioButtonId != -1) {
                result += "Selected Gender is : "

                if (rb_male.isChecked) {
                    result += "Male"
                } else if (rb_female.isChecked) {
                    result += "Female"
                }
            }

//            if (rg_different.checkedRadioButtonId != -1) {
//                result += "Selected Gender is: "
//
//                if (rb_diff.isChecked) {
//                    result += "diff"
//                } else if (rb_other.isChecked) {
//                    result += "other"
//                }
//            }
            result_2 += "The Sport Chosen is: "




            if (cb_cricket.isChecked) {
                if (cb_hockey.isChecked || cb_footBall.isChecked) {
                    moreThanOne = true
                }
                result_2 += "cricket"
                if (moreThanOne) {
                    result_2 += ", "
                    moreThanOne = false
                }
            }
            if (cb_footBall.isChecked) {
                if (moreThanOne) {
                    result_2 += ", "
                    moreThanOne = false
                }
                result_2 += "football"
            }
            if (cb_hockey.isChecked) {
//                moreThanOne = true
                result_2 += "hockey"
            }

            if (!(result_2.contains("football") || result_2.contains("hockey") || result_2.contains("cricket"))) {
                result_2 += "Laziness"
            }

            tv_final_1.text = result
            tv_final_2.text = result_2
//            result = ""
        })

    }
}
