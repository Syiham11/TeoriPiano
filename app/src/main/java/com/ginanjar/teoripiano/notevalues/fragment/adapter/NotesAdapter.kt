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
import com.ginanjar.teoripiano.notevalues.fragment.data.NotesDatas

/**
 * Created by MrDoyon on 3/20/2018.
 */
class NotesAdapter(val c: Context, val notesData: List<NotesDatas>): RecyclerView.Adapter<NotesAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row_notes, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return notesData.size
    }

    override fun onBindViewHolder(h: ViewHolder?, position: Int) {
        val data = notesData[position]
        h?.gambar?.setImageResource(data.img)
        h?.judul?.text = data.title
        h?.desc?.text = data.desc
        h?.item?.setOnClickListener {
            MediaPlayer.create(c, data.sound).start()
        }
    }

    class ViewHolder(i: View): RecyclerView.ViewHolder(i) {
        val gambar = i.findViewById<ImageView>(R.id.notesImg)
        val judul = i.findViewById<TextView>(R.id.notesTitle)
        val desc = i.findViewById<TextView>(R.id.notesDesc)
        val item = i.findViewById<RelativeLayout>(R.id.notesItem)
    }

}