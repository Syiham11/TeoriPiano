package com.ginanjar.teoripiano.chord

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.chord.fragments.ExtendedFragment
import com.ginanjar.teoripiano.chord.fragments.FourVoiceFragment
import com.ginanjar.teoripiano.chord.fragments.TriadsFragment

class ChordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chord)

        val toolbarToko = findViewById<android.support.v7.widget.Toolbar>(R.id.toolbarChord)
        setSupportActionBar(toolbarToko)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Chord")

        val sectionPager = ChordAdapter(supportFragmentManager)

        sectionPager.addFragment(TriadsFragment(), "TRIADS")
        sectionPager.addFragment(FourVoiceFragment(), "FOUR-VOICE")
        sectionPager.addFragment(ExtendedFragment(), "EXTENDED")

        val viewPager = findViewById<ViewPager>(R.id.pagerToko)
        viewPager.offscreenPageLimit = 2
        viewPager.adapter = sectionPager

        val tabToko = findViewById<TabLayout>(R.id.tabChord)
        tabToko.setupWithViewPager(viewPager)
    }
}
