package com.ginanjar.teoripiano.intervals.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.intervals.fragments.adapter.m9Adapter
import com.ginanjar.teoripiano.intervals.fragments.data.m9Datas


/**
 * A simple [Fragment] subclass.
 */
class M9P15Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_m9_p15, container, false)

        // panggil recy
        val recy = v.findViewById<RecyclerView>(R.id.m9Recy)
        // set layout
        recy.layoutManager = LinearLayoutManager(context)
        // set data
        val recyData = ArrayList<m9Datas>()
        // set ke adapter
        val adapter = m9Adapter(context, setData(recyData))
        // set adapter ke recy
        recy.adapter = adapter

        return v
    }

    private fun setData(recyData: ArrayList<m9Datas>): List<m9Datas> {
        recyData.add(m9Datas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "Judul",
                "iki desc1",
                "iki desc2"
        ))

        recyData.add(m9Datas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "Judul",
                "iki desc1",
                "iki desc2"
        ))

        recyData.add(m9Datas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "Judul",
                "iki desc1",
                "iki desc2"
        ))

        return recyData
    }

}// Required empty public constructor
