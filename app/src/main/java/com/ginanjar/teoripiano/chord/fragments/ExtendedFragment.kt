package com.ginanjar.teoripiano.chord.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.chord.fragments.adapter.ExtendedAdapter
import com.ginanjar.teoripiano.chord.fragments.data.ExtendedDatas

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ExtendedFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ExtendedFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ExtendedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_extended, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.recyEx)
        recy.layoutManager = LinearLayoutManager(context)

        val exData = ArrayList<ExtendedDatas>()

        val adapter = ExtendedAdapter(context, setData(exData))
        recy.adapter = adapter

        return v
    }

    private fun setData(exData: ArrayList<ExtendedDatas>): List<ExtendedDatas> {
        exData.add(ExtendedDatas(
                R.mipmap.ic_launcher, R.raw.music,
                "Major",
                "Root1", "Root2", "Root3", "Root4", "Root5",
                "G", "F", "G", "J", "K"
        ))

        exData.add(ExtendedDatas(
                R.mipmap.ic_launcher, R.raw.music,
                "Minor",
                "Root1", "Root2", "Root3", "Root4", "Root5",
                "G", "F", "G", "J", "K"
        ))

        return exData
    }

}// Required empty public constructor
