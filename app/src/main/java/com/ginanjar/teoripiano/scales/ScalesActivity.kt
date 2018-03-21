package com.ginanjar.teoripiano.scales

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.widget.ImageView
import android.widget.TextView
import com.ginanjar.teoripiano.MainView
import com.ginanjar.teoripiano.R
import com.ginanjar.teoripiano.scales.adapter.ScalesAdapter
import com.ginanjar.teoripiano.scales.data.ScalesDatas
import com.ms.square.android.expandabletextview.ExpandableTextView

class ScalesActivity : AppCompatActivity(), MainView.ScalesView {

    var nama: TextView? = null
    var gambar: ImageView? = null
    var expTv1: ExpandableTextView? = null
    var play: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scales)

//        val toolbar = findViewById<Toolbar>(R.id.toolbarScales)
//        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Scales")

        val recy = findViewById<RecyclerView>(R.id.scalesRecy)
        recy.layoutManager = LinearLayoutManager(applicationContext)

        val recyData = ArrayList<ScalesDatas>()

        val adapter = ScalesAdapter(applicationContext, setData(recyData), this)

        recy.adapter = adapter

        nama = findViewById<TextView>(R.id.scalesTitle)
        gambar = findViewById<ImageView>(R.id.scalesImg)
        play = findViewById<TextView>(R.id.playBtn)

        nama?.text = recyData[0].judul
        gambar?.setImageResource(recyData[0].image)

        expTv1 = findViewById(R.id.expand_text_view) as ExpandableTextView
        expTv1?.text = recyData[0].exText
    }

    override fun changeText(judul: String, image: Int, exText: String, sound: Int) {
        nama?.text = judul
        gambar?.setImageResource(image)
        expTv1?.text = exText
        play?.setOnClickListener {
            MediaPlayer.create(applicationContext, sound).start()
        }
    }

    private fun setData(recyData: ArrayList<ScalesDatas>): List<ScalesDatas> {
        recyData.add(ScalesDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "Kategori 1",
                "Minor",
                "ksjflsdkjfsdkljflsdkjfsdjfklsdjflsdkjflsdkjfksdljfksdljflksdjfklsdjfklsdjfksdjf"
        ))

        recyData.add(ScalesDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "Kategori 2",
                "Mayor",
                "secawan madu mantap pisan euy"
        ))


        return recyData
    }
}
