package com.ginanjar.teoripiano.octaves

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.RelativeLayout
import com.ginanjar.teoripiano.R

class OctavesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_octaves)

//        val toolbar = findViewById<Toolbar>(R.id.octavesToolbar)
//        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Octaves")

        val card1 = findViewById<RelativeLayout>(R.id.card1)
        val card2 = findViewById<RelativeLayout>(R.id.card2)

        card1.setOnClickListener {
            MediaPlayer.create(applicationContext, R.raw.music).start()
        }

        card2.setOnClickListener {
            MediaPlayer.create(applicationContext, R.raw.music).start()
        }

    }
}
