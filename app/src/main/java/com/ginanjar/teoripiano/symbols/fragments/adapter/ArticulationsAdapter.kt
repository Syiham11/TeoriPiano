package com.ginanjar.teoripiano.symbols.fragments.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.symbols.fragments.data.ArticulationDatas

/**
 * Created by MrDoyon on 3/20/2018.
 */
class ArticulationsAdapter(val c: Context, val artData: List<ArticulationDatas>): RecyclerView.Adapter<ArticulationsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_articulations, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return artData.size
    }

    override fun onBindViewHolder(h: ViewHolder?, position: Int) {
        val data = artData[position]
        h?.img?.setImageResource(data.img)
        h?.title?.text = data.title
        h?.desc?.text = data.desc
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val img = i.findViewById<ImageView>(R.id.artImg)
        val title = i.findViewById<TextView>(R.id.artTitle)
        val desc = i.findViewById<TextView>(R.id.artDesc)
    }

}