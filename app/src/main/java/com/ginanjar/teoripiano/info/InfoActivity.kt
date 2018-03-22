package com.ginanjar.teoripiano.info

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ginanjar.teoripiano.R

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Info Aplikasi")
    }
}
