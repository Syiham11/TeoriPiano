package com.ginanjar.teoripiano

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ginanjar.teoripiano.main.MainActivity
import android.content.Intent
import android.os.Handler


/**
 * Created by MrDoyon on 3/22/2018.
 */
class SplashActivity: AppCompatActivity() {

    internal var SPLASH_TIME_OUT = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler().postDelayed({
            // Start Main Activity
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }
}
