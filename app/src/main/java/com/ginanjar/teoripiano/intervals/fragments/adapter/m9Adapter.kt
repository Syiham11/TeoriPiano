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
import com.ginanjar.teoripiano.intervals.fragments.data.m9Datas

/**
 * Created by MrDoyon on 3/20/2018.
 */
class m9Adapter(val c: Context, val m9Data: List<m9Datas>): RecyclerView.Adapter<m9Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_m9, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return m9Data.size
    }

    override fun onBindViewHolder(h: ViewHolder?, position: Int) {
        val data = m9Data[position]
        h?.gambar?.setImageResource(data.img)
        h?.judul?.text = data.title
        h?.desc1?.text = data.desc1
        h?.desc2?.text = data.desc2
        h?.item?.setOnClickListener {
            MediaPlayer.create(c, data.sound).start()
        }
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val gambar = i.findViewById<ImageView>(R.id.m9Img)
        val judul = i.findViewById<TextView>(R.id.m9Title)
        val desc1 = i.findViewById<TextView>(R.id.m9Desc1)
        val desc2 = i.findViewById<TextView>(R.id.m9Desc2)
        val item = i.findViewById<RelativeLayout>(R.id.m9Item)
    }
}