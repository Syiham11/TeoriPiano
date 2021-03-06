package com.ginanjar.teoripiano.chord.fragments.adapter

import android.content.Context
import android.media.MediaPlayer
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.chord.fragments.data.TriadsDatas

/**
 * Created by MrDoyon on 3/20/2018.
 */
class TriadsAdapter(val c: Context, val chordData: List<TriadsDatas>): RecyclerView.Adapter<TriadsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_chord, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return chordData.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val data = chordData[position]

        holder?.img?.setImageResource(data.img)
        holder?.judul?.text = data.title
        holder?.txt1?.text = data.txt1
        holder?.txt2?.text = data.txt2
        holder?.txt3?.text = data.txt3
        holder?.txt4?.text = data.txt4
        holder?.txt5?.text = data.txt5
        holder?.txt6?.text = data.txt6

        holder?.item?.setOnClickListener {
            val sound = MediaPlayer.create(c, data.sound)
            sound.start()
        }
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val img = i.findViewById<ImageView>(R.id.imgChord)
        val judul = i.findViewById<TextView>(R.id.titleChord)
        val txt1 = i.findViewById<TextView>(R.id.txt1)
        val txt2 = i.findViewById<TextView>(R.id.txt2)
        val txt3 = i.findViewById<TextView>(R.id.txt3)
        val txt4 = i.findViewById<TextView>(R.id.txt4)
        val txt5 = i.findViewById<TextView>(R.id.txt5)
        val txt6 = i.findViewById<TextView>(R.id.txt6)
        val item = i.findViewById<RelativeLayout>(R.id.chordItem)
    }

}