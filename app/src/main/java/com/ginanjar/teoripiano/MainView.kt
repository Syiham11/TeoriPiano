package com.ginanjar.teoripiano

import android.content.Intent

/**
 * Created by MrDoyon on 3/19/2018.
 */
class MainView{
    interface HomeView{
        fun goTo(intent: Intent)
    }
    interface ScalesView{
        fun changeText(judul: String, image: Int, exText: String, sound: Int)
    }
}