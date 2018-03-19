package com.ginanjar.teoripiano.symbols.fragments.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.symbols.fragments.data.KeyPitchDatas

/**
 * Created by MrDoyon on 3/20/2018.
 */
class KeyPitchAdapter(val c: Context, val keyData: List<KeyPitchDatas>): RecyclerView.Adapter<KeyPitchAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_keypitch, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return keyData.size
    }

    override fun onBindViewHolder(h: ViewHolder?, position: Int) {
        val data = keyData[position]
        h?.title?.text = data.title
        h?.desc?.text = data.desc
        if(position != 0 && position != 1){
            h?.img?.setImageResource(data.img)
        } else {
            h?.img?.visibility = View.GONE
        }
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val img = i.findViewById<ImageView>(R.id.keyImg)
        val title = i.findViewById<TextView>(R.id.keyTitle)
        val desc = i.findViewById<TextView>(R.id.keyDesc)
    }
}