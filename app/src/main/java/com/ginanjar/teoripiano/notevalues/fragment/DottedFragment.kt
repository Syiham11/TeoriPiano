package com.ginanjar.teoripiano.notevalues.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.notevalues.fragment.adapter.DottedAdapter
import com.ginanjar.teoripiano.notevalues.fragment.data.DottedDatas


/**
 * A simple [Fragment] subclass.
 */
class DottedFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_dotted, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.dottedRecy)
        recy.layoutManager = LinearLayoutManager(context)
        val recyData = ArrayList<DottedDatas>()
        val adapter = DottedAdapter(context, setData(recyData))
        recy.adapter = adapter

        return v
    }

    private fun setData(recyData: ArrayList<DottedDatas>): List<DottedDatas> {

        recyData.add(DottedDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(DottedDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(DottedDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        return recyData
    }
}// Required empty public constructor
