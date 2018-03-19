package com.ginanjar.teoripiano.symbols.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.symbols.fragments.adapter.ArticulationsAdapter
import com.ginanjar.teoripiano.symbols.fragments.data.ArticulationDatas


/**
 * A simple [Fragment] subclass.
 */
class ArticulationFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v =  inflater!!.inflate(R.layout.fragment_articulation, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.articulationRecy)
        recy.layoutManager = LinearLayoutManager(context)
        val recyData = ArrayList<ArticulationDatas>()
        val adapter = ArticulationsAdapter(context, setData(recyData))
        recy.adapter = adapter

        return v
    }

    private fun setData(recyData: ArrayList<ArticulationDatas>): List<ArticulationDatas> {

        recyData.add(ArticulationDatas(
                R.mipmap.ic_launcher,
                "Staccato",
                "Play the note shorter than normal"
        ))

        recyData.add(ArticulationDatas(
                R.mipmap.ic_launcher,
                "Staccato",
                "Play the note shorter than normal"
        ))

        return recyData
    }

}// Required empty public constructor
