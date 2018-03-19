package com.ginanjar.teoripiano.intervals

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by MrDoyon on 3/20/2018.
 */
class IntervalsPagerAdapter(fm: android.support.v4.app.FragmentManager): FragmentPagerAdapter(fm){

    val itemFragment: ArrayList<Fragment> = ArrayList()
    val titleFragment: ArrayList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return itemFragment[position]
    }

    override fun getCount(): Int {
        return itemFragment.size
    }

    fun addFragment(item: Fragment, title: String){
        itemFragment.add(item)
        titleFragment.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return titleFragment[position]
    }
}