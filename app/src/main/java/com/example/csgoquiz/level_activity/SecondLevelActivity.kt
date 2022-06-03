package com.example.csgoquiz.level_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.example.csgoquiz.R

class SecondLevelActivity : AppCompatActivity(){

    private lateinit var toolbar2: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_level)

        toolbar2 = findViewById(R.id.toolbar2)
        toolbar2.setNavigationOnClickListener {
            finish()
        }
    }
}