package com.ginanjar.teoripiano.symbols

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.symbols.fragments.ArticulationFragment
import com.ginanjar.teoripiano.symbols.fragments.BarsFragment
import com.ginanjar.teoripiano.symbols.fragments.DynamicsFragment
import com.ginanjar.teoripiano.symbols.fragments.KeyPitchFragment

class SymbolsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symbols)

        val toolbarToko = findViewById<Toolbar>(R.id.symbolsToolbar)
        setSupportActionBar(toolbarToko)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Symbols")

        val sectionPager = SymbolsAdapter(supportFragmentManager)

        sectionPager.addFragment(DynamicsFragment(), "DYNAMICS")
        sectionPager.addFragment(ArticulationFragment(), "ARTICULATION")
        sectionPager.addFragment(BarsFragment(), "BARS")
        sectionPager.addFragment(KeyPitchFragment(), "KEY AND PITCH")

        val viewPager = findViewById<ViewPager>(R.id.symbolsPager)
        viewPager.offscreenPageLimit = 3
        viewPager.adapter = sectionPager

        val tabToko = findViewById<TabLayout>(R.id.symbolsTab)
        tabToko.setupWithViewPager(viewPager)
    }
}
