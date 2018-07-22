package com.example.rk00486408.practise_application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_auto_complete.*

class AutoComplete : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

        var options = arrayOf("one", "two", "three", "four","a","b","c")

        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1 , options)

        autocomplete_textview.threshold = 0
        autocomplete_textview.setAdapter(adapter)

    }
}
