package com.ginanjar.teoripiano.chord.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.chord.fragments.adapter.TriadsAdapter
import com.ginanjar.teoripiano.chord.fragments.data.TriadsDatas


/**
 * A simple [Fragment] subclass.
 */
class TriadsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_triads, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.chordRecy)
        recy.layoutManager = LinearLayoutManager(context)

        val chordData = ArrayList<TriadsDatas>()

        val adapter = TriadsAdapter(context, setData(chordData))
        recy.adapter = adapter

        return v
    }

    private fun setData(chordData: ArrayList<TriadsDatas>): List<TriadsDatas> {
        chordData.add(TriadsDatas(
                R.drawable.c_dur, R.raw.music,
                "Major",
                "(1)Root", "(3)Major Third", "(5)Perfect Fifth",
                "C", "E", "G"
        ))

        chordData.add(TriadsDatas(
                R.drawable.c_moll, R.raw.music,
                "Minor",
                "(1)Root", "Root2", "Root3",
                "C", "D", "G"
        ))

        return chordData
    }

}// Required empty public constructor
