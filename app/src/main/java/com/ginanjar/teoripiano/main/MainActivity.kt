package com.ginanjar.teoripiano.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.widget.ImageView
import com.ginanjar.teoripiano.info.InfoActivity
import com.ginanjar.teoripiano.MainView
import com.ginanjar.teoripiano.R
import com.viewpagerindicator.CirclePageIndicator

class MainActivity : AppCompatActivity(), MainView.HomeView  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuData = ArrayList<MenuDatas>()
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.chord)))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.notasi)))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.nilai_notasi)))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.tempo)))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.circle)))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.skala)))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.oktaf)))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.simbol)))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.virtual_piano)))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, getString(R.string.tes_musik)))

        val pager = findViewById<ViewPager>(R.id.menuPager)
        val adapter = MenuViewPagerAdapter(applicationContext, menuData, this)
        pager.adapter = adapter

        // Circle indicator
        val circle = findViewById<CirclePageIndicator>(R.id.circleIndicator)
        circle?.setViewPager(pager)
        val density = getResources().getDisplayMetrics().density
        circle?.radius = 5 * density

        val logoMain = findViewById<ImageView>(R.id.logo_main)
        logoMain.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }
    }

    override fun goTo(intent: Intent) {
        startActivity(intent)
    }
}
