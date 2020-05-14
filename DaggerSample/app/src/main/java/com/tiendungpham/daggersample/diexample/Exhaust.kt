package com.tiendungpham.daggersample.diexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Exhaust @Inject constructor(val version: Int) {
    fun viewExhaustVersion() {
        Log.i("MyCar", "Exhaust version $version")
    }
}