package com.example.csgoquiz.level_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.example.csgoquiz.R

class ThirdLevelActivity : AppCompatActivity(){

    private lateinit var toolbar3: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_level)

        toolbar3 = findViewById(R.id.toolbar3)
        toolbar3.setNavigationOnClickListener {
            finish()
        }
    }
}