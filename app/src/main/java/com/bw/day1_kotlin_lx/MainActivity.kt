package com.bw.day1_kotlin_lx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity(),View.OnClickListener {
    var button : Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.bt)
        button!!.setOnClickListener(this)
//        button!!.setOnClickListener()

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.bt ->
                Toast.makeText(this,"点击",Toast.LENGTH_SHORT).show()
        }
    }

}