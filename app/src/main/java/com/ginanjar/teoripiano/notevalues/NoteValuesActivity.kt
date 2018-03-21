package com.ginanjar.teoripiano.notevalues

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.notevalues.fragment.DottedFragment
import com.ginanjar.teoripiano.notevalues.fragment.NotesFragment
import com.ginanjar.teoripiano.notevalues.fragment.TripletsFragment

class NoteValuesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_values)

//        val toolbar = findViewById<Toolbar>(R.id.noteToolbar)
//        setSupportActionBar(toolbar)
        supportActionBar?.setTitle("Note Values")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.elevation = 0F

        // set pager
        val pager = findViewById<ViewPager>(R.id.notePager)
        // panggil pager adapter
        val adapter = NoteValuesPagerAdapter(supportFragmentManager)
        // set fragment
        adapter.addFragment(NotesFragment(), "Notes")
        adapter.addFragment(TripletsFragment(), "Triplets")
        adapter.addFragment(DottedFragment(), "Dotted")
        // set adapter ke pager
        pager.offscreenPageLimit = 2
        pager.adapter = adapter

        // set tab ke pager
        val tab = findViewById<TabLayout>(R.id.noteTab)
        tab.setupWithViewPager(pager)
    }
}
