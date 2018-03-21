package com.ginanjar.teoripiano.circle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.ginanjar.teoripiano.R

class CircleOfFifthsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_of_fifths)
//        val toolbar = findViewById<Toolbar>(R.id.toolbarCircle)
//        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Circle Of Fifths")
    }
}
