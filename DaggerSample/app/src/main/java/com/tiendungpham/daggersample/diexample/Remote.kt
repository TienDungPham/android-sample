package com.tiendungpham.daggersample.diexample

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    fun setRemoteController() {
        Log.i("MyCar", "Remote controller enabled")
    }
}