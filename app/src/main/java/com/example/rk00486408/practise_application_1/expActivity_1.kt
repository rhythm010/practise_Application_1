package com.example.rk00486408.practise_application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import org.w3c.dom.Text

class expActivity_1 : AppCompatActivity() {

    lateinit var tv_main: TextView

    lateinit var sb_1 : SeekBar

    lateinit var sw_1: Switch
    lateinit var sw_2: Switch
    lateinit var sw_3: Switch


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exp_1)

        var size = 10

        sw_1 = findViewById(R.id.sw_1) as Switch
        sw_2 = findViewById(R.id.sw_2) as Switch
        sw_3 = findViewById(R.id.sw_3) as Switch

        tv_main = findViewById(R.id.tv_main) as TextView

        sb_1 = findViewById(R.id.sb_1) as SeekBar

        sb_1.max = 100
//        sb_1.min = 20

        sb_1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if(p1 > 20){
                    tv_main.textSize = p1.toFloat()
                }

                if (p1 > 20 && p1 < 40) {
                    sw_1.setChecked(true)
                    sw_2.setChecked(false)
                    sw_3.setChecked(false)
                    tv_main.text = "level 1"
                    // for the first part
                } else if(p1 > 40 && p1 < 80){
                    // for the middle part
                    sw_1.setChecked(true)
                    sw_2.setChecked(true)
                    sw_3.setChecked(false)
                    tv_main.text = "level 2"
                } else if (p1 > 80){
                    sw_1.setChecked(true)
                    sw_2.setChecked(true)
                    sw_3.setChecked(true)
                    tv_main.text = "level 3"
                    // for the end part
                } else {
                    sw_1.setChecked(false)
                    sw_2.setChecked(false) 
                    sw_3.setChecked(false)
                    tv_main.text = "level 0"
                    // for the start part
                }

//            tv_main.textSize =
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })


    }


}