package com.ginanjar.teoripiano.symbols.fragments.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.symbols.fragments.data.DynamicsDatas

/**
 * Created by MrDoyon on 3/20/2018.
 */
class DynamicsAdapter(val c: Context, val dynamicsData: List<DynamicsDatas>): RecyclerView.Adapter<DynamicsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_dynamics, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return dynamicsData.size
    }

    override fun onBindViewHolder(h: ViewHolder?, position: Int) {
        val data = dynamicsData[position]
        h?.title?.text = data.title
        h?.big?.text = data.big
        h?.bottom?.text = data.bottom
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val title = i.findViewById<TextView>(R.id.dynamicsTitle)
        val big = i.findViewById<TextView>(R.id.dynamicsBig)
        val bottom = i.findViewById<TextView>(R.id.dynamicsBottom)
    }

}