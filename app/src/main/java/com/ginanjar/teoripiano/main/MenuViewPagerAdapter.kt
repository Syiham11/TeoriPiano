package com.ginanjar.teoripiano.main

import android.content.Context
import android.content.Intent
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.ginanjar.teoripiano.MainView
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.chord.ChordActivity
import com.ginanjar.teoripiano.circle.CircleOfFifthsActivity
import com.ginanjar.teoripiano.intervals.IntervalsActivity
import com.ginanjar.teoripiano.notevalues.NoteValuesActivity
import com.ginanjar.teoripiano.octaves.OctavesActivity
import com.ginanjar.teoripiano.piano.PianoActivity
import com.ginanjar.teoripiano.rests.RestsActivity
import com.ginanjar.teoripiano.scales.ScalesActivity
import com.ginanjar.teoripiano.symbols.SymbolsActivity
import com.ginanjar.teoripiano.test.TestActivity

/**
 * Created by MrDoyon on 3/19/2018.
 */
class MenuViewPagerAdapter(val c: Context, val menuDatas: List<MenuDatas>, val view: MainView.HomeView): PagerAdapter() {

    override fun isViewFromObject(view: View?, `object`: Any?): Boolean =
            view == `object` as RelativeLayout

    override fun getCount(): Int = menuDatas.size

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        val v = LayoutInflater.from(container?.context).inflate(R.layout.row_menu, container, false)

        val menu = menuDatas[position]

        val img = v.findViewById<ImageView>(R.id.menuImg)
        val title = v.findViewById<TextView>(R.id.menuTitle)

        img.setImageResource(menu.img)
        title.text = menu.title

        img.setOnClickListener {
            when{
                position == 0 -> {
                    val intent = Intent(c, ChordActivity::class.java)
                    view.goTo(intent)
                }
                position == 1 -> {
                    val intent = Intent(c, IntervalsActivity::class.java)
                    view.goTo(intent)
                }
                position == 2 -> {
                    val intent = Intent(c, NoteValuesActivity::class.java)
                    view.goTo(intent)
                }
                position == 3 -> {
                    val intent = Intent(c, RestsActivity::class.java)
                    view.goTo(intent)
                }
                position == 4 -> {
                    val intent = Intent(c, CircleOfFifthsActivity::class.java)
                    view.goTo(intent)
                }
                position == 5 -> {
                    val intent = Intent(c, ScalesActivity::class.java)
                    view.goTo(intent)
                }
                position == 6 -> {
                    val intent = Intent(c, OctavesActivity::class.java)
                    view.goTo(intent)
                }
                position == 7 -> {
                    val intent = Intent(c, SymbolsActivity::class.java)
                    view.goTo(intent)
                }
                position == 8 -> {
                    val intent = Intent(c, PianoActivity::class.java)
                    view.goTo(intent)
                }
                position == 9 -> {
                    val intent = Intent(c, TestActivity::class.java)
                    view.goTo(intent)
                }
            }
        }

        container?.addView(v)

        return v
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        container?.removeView(`object` as RelativeLayout)
    }
}