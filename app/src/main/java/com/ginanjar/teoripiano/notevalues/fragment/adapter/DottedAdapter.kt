package com.ginanjar.teoripiano.notevalues.fragment.adapter

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
import com.ginanjar.teoripiano.notevalues.fragment.data.DottedDatas

/**
 * Created by MrDoyon on 3/20/2018.
 */
class DottedAdapter(val c: Context, val dottedData: List<DottedDatas>): RecyclerView.Adapter<DottedAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_dotted, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return dottedData.size
    }

    override fun onBindViewHolder(h: ViewHolder?, position: Int) {
        val data = dottedData[position]
        h?.gambar?.setImageResource(data.img)
        h?.judul?.text = data.title
        h?.desc?.text = data.desc
        if(position != 0 && position != 1){
            h?.item?.setOnClickListener {
                MediaPlayer.create(c, data.sound).start()
            }
        } else {
            h?.play?.visibility = View.GONE
        }
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val gambar = i.findViewById<ImageView>(R.id.dottedImg)
        val judul = i.findViewById<TextView>(R.id.dottedTitle)
        val desc = i.findViewById<TextView>(R.id.dottedDesc)
        val item = i.findViewById<RelativeLayout>(R.id.dottedItem)
        val play = i.findViewById<ImageView>(R.id.dottedPlay)
    }

}