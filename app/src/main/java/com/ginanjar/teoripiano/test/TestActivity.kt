package com.ginanjar.teoripiano.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.ginanjar.teoripiano.R

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val toolbar = findViewById<Toolbar>(R.id.test_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle("Tes Musik")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
