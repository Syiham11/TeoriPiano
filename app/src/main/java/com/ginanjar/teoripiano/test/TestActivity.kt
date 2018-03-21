package com.ginanjar.teoripiano.test

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.CardView
import android.support.v7.widget.Toolbar
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.ginanjar.teoripiano.R
import java.util.*
import kotlin.collections.ArrayList

class TestActivity : AppCompatActivity() {

    var numTest: TextView? = null
    var numQuestion: TextView? = null
    var numImg: ImageView? = null
    var opsi1: CardView? = null
    var opsi2: CardView? = null
    var opsi3: CardView? = null
    var opsi4: CardView? = null
    var opsi1Txt: TextView? = null
    var opsi2Txt: TextView? = null
    var opsi3Txt: TextView? = null
    var opsi4Txt: TextView? = null
    val dataQuest = ArrayList<TestDatas>()
    val min = 0
    val max = 7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
//        val toolbar = findViewById<Toolbar>(R.id.test_toolbar)
//        setSupportActionBar(toolbar)
        supportActionBar?.setTitle("Tes Musik")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        numTest = findViewById(R.id.test_num)
        numQuestion = findViewById(R.id.test_question)
        numImg = findViewById(R.id.test_img)
        opsi1 = findViewById(R.id.opsi_1)
        opsi2 = findViewById(R.id.opsi_2)
        opsi3 = findViewById(R.id.opsi_3)
        opsi4 = findViewById(R.id.opsi_4)
        opsi1Txt = findViewById(R.id.opsi_1_text)
        opsi2Txt = findViewById(R.id.opsi_2_text)
        opsi3Txt = findViewById(R.id.opsi_3_text)
        opsi4Txt = findViewById(R.id.opsi_4_text)

        setQuestion()
        randomQuestion(min, max, dataQuest)
    }

    private fun randomQuestion(min: Int, max: Int, data: ArrayList<TestDatas>) {
        val rand = Random()
        val randomNum = rand.nextInt((max - min) + 1) + min

        numTest?.text = data[randomNum].num
        numQuestion?.text = data[randomNum].question
        numImg?.setImageResource(data[randomNum].img)
        opsi1Txt?.text = data[randomNum].opsi1
        opsi2Txt?.text = data[randomNum].opsi2
        opsi3Txt?.text = data[randomNum].opsi3
        opsi4Txt?.text = data[randomNum].opsi4

        opsi1?.setOnClickListener{
            checkAnswer(1, data[randomNum].opsiBenar, opsi1)
        }
        opsi2?.setOnClickListener{
            checkAnswer(2, data[randomNum].opsiBenar, opsi2)
        }
        opsi3?.setOnClickListener{
            checkAnswer(3, data[randomNum].opsiBenar, opsi3)
        }
        opsi4?.setOnClickListener{
            checkAnswer(4, data[randomNum].opsiBenar, opsi4)
        }
    }

    private fun checkAnswer(opsi: Int, opsiBenar: Int, card: CardView?) {
        if(opsi == opsiBenar){
            card?.setBackgroundColor(Color.parseColor("#72ba3a"))
            isEnabledOpsi(false)
            Handler().postDelayed({
                randomQuestion(min, max, dataQuest)
                isEnabledOpsi(true)
                setBackgroundToWhite()
            }, 500)
        } else {
            card?.setBackgroundColor(Color.parseColor("#d75466"))
        }
    }

    private fun setBackgroundToWhite() {
        opsi1?.setBackgroundColor(Color.parseColor("#f8f9fa"))
        opsi2?.setBackgroundColor(Color.parseColor("#f8f9fa"))
        opsi3?.setBackgroundColor(Color.parseColor("#f8f9fa"))
        opsi4?.setBackgroundColor(Color.parseColor("#f8f9fa"))
    }

    private fun isEnabledOpsi(b: Boolean) {
        opsi1?.isEnabled = b
        opsi2?.isEnabled = b
        opsi3?.isEnabled = b
        opsi4?.isEnabled = b
    }

    private fun setQuestion() {
        dataQuest.add(TestDatas(
                "1",
                "Apakah saya tampan?",
                R.drawable.ic_launcher_background,
                "Ya", "Tidak", "Bisa Jadi", "No Comment",
                1
        ))
        dataQuest.add(TestDatas(
                "2",
                "Apakah saya jelek?",
                R.drawable.ic_launcher_background,
                "Ya", "Tidak", "Bisa Jadi", "No Comment",
                2
        ))
        dataQuest.add(TestDatas(
                "3",
                "Apakah saya cantik?",
                R.drawable.ic_launcher_background,
                "Ya", "Tidak", "Bisa Jadi", "No Comment",
                3
        ))
        dataQuest.add(TestDatas(
                "4",
                "Apakah saya gagah?",
                R.drawable.ic_launcher_background,
                "Ya", "Tidak", "Bisa Jadi", "No Comment",
                1
        ))
        dataQuest.add(TestDatas(
                "5",
                "Apakah saya gagah?",
                R.drawable.ic_launcher_background,
                "Ya", "Tidak", "Bisa Jadi", "No Comment",
                1
        ))
        dataQuest.add(TestDatas(
                "6",
                "Apakah saya gagah?",
                R.drawable.ic_launcher_background,
                "Ya", "Tidak", "Bisa Jadi", "No Comment",
                1
        ))
        dataQuest.add(TestDatas(
                "7",
                "Apakah saya gagah?",
                R.drawable.ic_launcher_background,
                "Ya", "Tidak", "Bisa Jadi", "No Comment",
                1
        ))
        dataQuest.add(TestDatas(
                "8",
                "Apakah saya gagah?",
                R.drawable.ic_launcher_background,
                "Ya", "Tidak", "Bisa Jadi", "No Comment",
                1
        ))
    }
}
