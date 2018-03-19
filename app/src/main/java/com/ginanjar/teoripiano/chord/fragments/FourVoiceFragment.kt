package com.ginanjar.teoripiano.chord.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.chord.fragments.adapter.FourVoiceAdapter
import com.ginanjar.teoripiano.chord.fragments.data.FourVoiceDatas


/**
 * A simple [Fragment] subclass.
 */
class FourVoiceFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_four_voice, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.recyFour)
        recy.layoutManager = LinearLayoutManager(context)

        val fourData = ArrayList<FourVoiceDatas>()

        val adapter = FourVoiceAdapter(context, setData(fourData))
        recy.adapter = adapter

        return v
    }

    private fun setData(fourData: ArrayList<FourVoiceDatas>): List<FourVoiceDatas> {
        fourData.add(FourVoiceDatas(
                R.mipmap.ic_launcher, R.raw.music,
                "Major",
                "Root1", "Root2", "Root3", "Root4",
                "D", "G", "D", "F"
        ))

        fourData.add(FourVoiceDatas(
                R.mipmap.ic_launcher, R.raw.music,
                "Minor",
                "Root1", "Root2", "Root3", "Root4",
                "D", "G", "D", "F"
        ))

        return fourData
    }

}// Required empty public constructor
