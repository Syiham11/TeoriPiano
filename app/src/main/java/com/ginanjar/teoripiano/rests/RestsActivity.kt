package com.ginanjar.teoripiano.rests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import com.ginanjar.teoripiano.R

class RestsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rests)

        val toolbar = findViewById<Toolbar>(R.id.restsToolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Rests"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recy = findViewById<RecyclerView>(R.id.restsRecy)
        recy.layoutManager = LinearLayoutManager(applicationContext)
        val recyData = ArrayList<RestsDatas>()
        val adapter = RestsAdapter(applicationContext, setData(recyData))
        recy.adapter = adapter
    }

    private fun setData(recyData: ArrayList<RestsDatas>): List<RestsDatas> {

        recyData.add(RestsDatas(
                R.mipmap.ic_launcher,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(RestsDatas(
                R.mipmap.ic_launcher,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(RestsDatas(
                R.mipmap.ic_launcher,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        return recyData
    }
}
