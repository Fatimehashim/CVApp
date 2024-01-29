package com.example.cvapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Nextbutton = findViewById<Button>(R.id.button2)
        Nextbutton.setOnClickListener{
            val intent = Intent(this,ExperienceActivity::class.java)
        }
    }
}