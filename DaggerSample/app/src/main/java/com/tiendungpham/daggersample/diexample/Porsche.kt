package com.tiendungpham.daggersample.diexample

import android.util.Log
import com.tiendungpham.daggersample.diexample.di.PorscheScope
import javax.inject.Inject

@PorscheScope
class Porsche @Inject constructor(var car: Car) {
}