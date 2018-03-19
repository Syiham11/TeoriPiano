package com.ginanjar.teoripiano.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.ginanjar.teoripiano.MainView
import com.ginanjar.teoripiano.R
import com.viewpagerindicator.CirclePageIndicator

class MainActivity : AppCompatActivity(), MainView.HomeView  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuData = ArrayList<MenuDatas>()
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Chords"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Intervals"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Note Values"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Rests"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Circle of Fifths"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Scales"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Octaves"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Symbols"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Virtual Piano"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Tes Musik"))

        val pager = findViewById<ViewPager>(R.id.menuPager)
        val adapter = MenuViewPagerAdapter(applicationContext, menuData, this)
        pager.adapter = adapter

        // Circle indicator
        val circle = findViewById<CirclePageIndicator>(R.id.circleIndicator)
        circle?.setViewPager(pager)
        val density = getResources().getDisplayMetrics().density
        circle?.radius = 5 * density
    }

    override fun goTo(intent: Intent) {
        startActivity(intent)
    }
}
