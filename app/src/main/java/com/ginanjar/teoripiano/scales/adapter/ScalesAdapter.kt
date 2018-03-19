package com.ginanjar.teoripiano.scales.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import com.ginanjar.teoripiano.MainView
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.scales.data.ScalesDatas

/**
 * Created by MrDoyon on 3/20/2018.
 */
class ScalesAdapter(val c: Context, val scalesData: List<ScalesDatas>, val view: MainView.ScalesView):
        RecyclerView.Adapter<ScalesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_scales, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return scalesData.size
    }

    override fun onBindViewHolder(h: ViewHolder?, position: Int) {
        val data = scalesData[position]
        h?.txt?.text = data.txt
        h?.item?.setOnClickListener {
            view.changeText(data.judul, data.image, data.exText, data.sound)
        }
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val txt = i.findViewById<TextView>(R.id.scalesTxt)
        val item = i.findViewById<RelativeLayout>(R.id.scalesItem)
    }
}