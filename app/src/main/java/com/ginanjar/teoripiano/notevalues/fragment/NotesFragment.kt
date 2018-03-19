package com.ginanjar.teoripiano.notevalues.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.notevalues.fragment.adapter.NotesAdapter
import com.ginanjar.teoripiano.notevalues.fragment.data.NotesDatas


/**
 * A simple [Fragment] subclass.
 */
class NotesFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_notes, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.notesRecy)
        recy.layoutManager = LinearLayoutManager(context)
        val recyData = ArrayList<NotesDatas>()
        val adapter = NotesAdapter(context, setData(recyData))
        recy.adapter = adapter

        return v
    }

    private fun setData(recyData: ArrayList<NotesDatas>): List<NotesDatas> {
        recyData.add(NotesDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(NotesDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "sssss",
                "sdfdsfds"
        ))

        recyData.add(NotesDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "aaaaaa",
                "sdfdsfds"
        ))

        return recyData
    }

}// Required empty public constructor
