package com.ginanjar.teoripiano.piano

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.ginanjar.teoripiano.R

class PianoActivity : AppCompatActivity(), View.OnTouchListener {

    //val VALUE_PARAM = "value_param"
    var valueParam = 1

    var pianoKeyC: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piano)
        val toolbar = findViewById<Toolbar>(R.id.pianoToolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle("Virtual Piano")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        pianoKeyC = findViewById(R.id.piano_key_c)
        if(valueParam == 1){
            pianoKeyC?.text = "C4"
        }

        val imgPlus = findViewById<ImageView>(R.id.img_plus)
        val imgMin = findViewById<ImageView>(R.id.img_min)

        imgMin.setOnClickListener {
            valueParam -= 1
            imgPlus.visibility = View.VISIBLE
            if(valueParam <= 0){
                valueParam = 0
                imgMin.visibility = View.GONE
            }
            checkKeyText()
            //Log.d(VALUE_PARAM, "param = $valueParam")
        }

        imgPlus.setOnClickListener {
            valueParam += 1
            imgMin.visibility = View.VISIBLE
            if(valueParam >= 2){
                valueParam = 2
                imgPlus.visibility = View.GONE
            }
            checkKeyText()
            //Log.d(VALUE_PARAM, "param = $valueParam")
        }

        // Mayor ===============================================
        val pianoC = findViewById<RelativeLayout>(R.id.piano_c)
        pianoC.setOnTouchListener(this)

        val pianoD = findViewById<RelativeLayout>(R.id.piano_d)
        pianoD.setOnTouchListener(this)

        val pianoE = findViewById<RelativeLayout>(R.id.piano_e)
        pianoE.setOnTouchListener(this)

        val pianoF = findViewById<RelativeLayout>(R.id.piano_f)
        pianoF.setOnTouchListener(this)

        val pianoG = findViewById<RelativeLayout>(R.id.piano_g)
        pianoG.setOnTouchListener(this)

        val pianoA = findViewById<RelativeLayout>(R.id.piano_a)
        pianoA.setOnTouchListener(this)

        val pianoB = findViewById<RelativeLayout>(R.id.piano_b)
        pianoB.setOnTouchListener(this)

        val pianoLastC = findViewById<RelativeLayout>(R.id.piano_c_last)
        pianoLastC.setOnTouchListener(this)

        // Minor =======================================================
        val minorDb = findViewById<RelativeLayout>(R.id.minor_Db)
        minorDb.setOnTouchListener(this)

        val minorEb = findViewById<RelativeLayout>(R.id.minor_Eb)
        minorEb.setOnTouchListener(this)

        val minorGb = findViewById<RelativeLayout>(R.id.minor_Gb)
        minorGb.setOnTouchListener(this)

        val minorAb = findViewById<RelativeLayout>(R.id.minor_Ab)
        minorAb.setOnTouchListener(this)

        val minorBb = findViewById<RelativeLayout>(R.id.minor_Bb)
        minorBb.setOnTouchListener(this)
    }

    override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
        when(p0?.id){
            R.id.piano_c -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.piano_d -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.piano_e -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.piano_f -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.piano_g -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.piano_a -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.piano_b -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.piano_c_last -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.minor_Db -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.minor_Eb -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.minor_Gb -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.minor_Ab -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
            R.id.minor_Bb -> {
                when (p1?.action){
                    MotionEvent.ACTION_DOWN -> {
                        p0.isPressed = true
                        when(valueParam){
                            0 -> MediaPlayer.create(this, R.raw.music).start()
                            1 -> MediaPlayer.create(this, R.raw.bell).start()
                            2 -> MediaPlayer.create(this, R.raw.music).start()
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        p0.isPressed = false
                    }
                }
            }
        }
        return true
    }

    private fun checkKeyText() {
        when (valueParam){
            0 -> pianoKeyC?.text = "C3"
            1 -> pianoKeyC?.text = "C4"
            2 -> pianoKeyC?.text = "C5"
            else -> pianoKeyC?.text = "C"
        }
    }
}
