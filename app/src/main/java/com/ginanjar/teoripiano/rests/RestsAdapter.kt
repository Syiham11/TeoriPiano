package com.ginanjar.teoripiano.rests

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.ginanjar.teoripiano.R

/**
 * Created by MrDoyon on 3/20/2018.
 */
class RestsAdapter(val c: Context, val restsData: List<RestsDatas>): RecyclerView.Adapter<RestsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_rests, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return restsData.size
    }

    override fun onBindViewHolder(h: ViewHolder?, position: Int) {
        val data = restsData[position]
        h?.gambar?.setImageResource(data.img)
        h?.judul?.text = data.title
        h?.desc?.text = data.desc
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val gambar = i.findViewById<ImageView>(R.id.restsImg)
        val judul = i.findViewById<TextView>(R.id.restsTitle)
        val desc = i.findViewById<TextView>(R.id.restsDesc)
    }

}