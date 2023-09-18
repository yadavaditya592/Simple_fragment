package com.example.simple_fragment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1=findViewById<Button>(R.id.add_fragment)
        val button2=findViewById<Button>(R.id.sec_fragment)

        button1.setOnClickListener {
            changeFragment(Fragment_one())
//            changeFragment(Fragment_Two())

        }
        button2.setOnClickListener {
            changeFragment(Fragment_Two())
        }

        }
    private fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit()
    }
    }
