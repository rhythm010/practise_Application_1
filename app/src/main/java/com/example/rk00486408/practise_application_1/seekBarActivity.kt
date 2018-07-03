package com.example.rk00486408.practise_application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import org.w3c.dom.Text

class seekBarActivity : AppCompatActivity() {

    lateinit var sk_1: SeekBar

    lateinit var tv_seekbar: TextView

    lateinit var bt_result: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        sk_1 = findViewById(R.id.sk_1) as SeekBar

        tv_seekbar = findViewById(R.id.tv_seekbar) as TextView


        bt_result = findViewById(R.id.bt_result) as Button


        sk_1.max = 50

        sk_1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                tv_seekbar.text = p1.toString()
                if (p1 > 25) {
                    tv_seekbar.text = "Over 25. Cannot go beyond"
                }

                if (p1 > 30) {
                    bt_result.visibility = View.VISIBLE
                } else {
                    bt_result.visibility = View.INVISIBLE

                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
//                tv_seekbar.text = "It is changing"
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })

    }
}
