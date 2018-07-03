package com.example.rk00486408.practise_application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class spinnerActivity : AppCompatActivity() {

    lateinit var sp_options: Spinner

    lateinit var tv_result: TextView

    lateinit var bt_show: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        sp_options = findViewById(R.id.sp_options) as Spinner

        tv_result = findViewById(R.id.tv_result) as TextView

        bt_show = findViewById(R.id.bt_show)


        bt_show.visibility = View.VISIBLE


        var options = arrayOf("option 1", "option 2", "option 3", 1234)
        sp_options.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options)

        sp_options.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                tv_result.text = "Nothing is selected"
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                tv_result.text = options.get(p2).toString()

                if (tv_result.text == "option 1") {
                    bt_show.visibility = View.INVISIBLE
                } else {
                    bt_show.visibility = View.VISIBLE
                }
//             bt_show.disa
            }
        }


    }
}
