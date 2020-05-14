package com.tiendungpham.daggersample.diexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Grille @Inject constructor(@Named("grille version") var grilleVersion: Int) {
    fun viewGrilleVersion() {
        Log.i("MyCar", "Grille version $grilleVersion")
    }
}