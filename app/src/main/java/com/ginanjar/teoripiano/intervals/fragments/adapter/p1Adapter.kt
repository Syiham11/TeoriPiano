package com.ginanjar.teoripiano.intervals.fragments.adapter

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
import com.ginanjar.teoripiano.intervals.fragments.data.p1Datas

/**
 * Created by MrDoyon on 3/20/2018.
 */
class p1Adapter(val c: Context, val p1Data: List<p1Datas>): RecyclerView.Adapter<p1Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_p1, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return p1Data.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val data = p1Data[position]
        holder?.img?.setImageResource(data.img)
        holder?.judul?.text = data.title
        holder?.desc?.text = data.desc
        holder?.card?.setOnClickListener {
            val sound = MediaPlayer.create(c, data.sound)
            sound.start()
        }
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val img = i.findViewById<ImageView>(R.id.p1Img)
        val judul = i.findViewById<TextView>(R.id.p1Title)
        val desc = i.findViewById<TextView>(R.id.p1Desc)
        val card = i.findViewById<RelativeLayout>(R.id.p1Item)
    }
}