package com.ginanjar.teoripiano.intervals.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.intervals.fragments.adapter.p1Adapter
import com.ginanjar.teoripiano.intervals.fragments.data.p1Datas


/**
 * A simple [Fragment] subclass.
 */
class P1P8Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_p1_p8, container, false)

        // panggil recycler
        val recy = v.findViewById<RecyclerView>(R.id.p1Recy)
        // set layout untuk recycler
        recy.layoutManager = LinearLayoutManager(context)
        // set data
        val recyData = ArrayList<p1Datas>()
        // set adapter
        val adapter = p1Adapter(context, setData(recyData))
        // set adapter ke recy
        recy.adapter = adapter

        return v
    }

    private fun setData(recyData: ArrayList<p1Datas>): List<p1Datas> {
        recyData.add(p1Datas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "Perfect Unison",
                "P1 00 BBB AAA"
        ))

        recyData.add(p1Datas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "Perfect Simple Plan",
                "P1 00 BBB AAA"
        ))

        return recyData
    }

}// Required empty public constructor
