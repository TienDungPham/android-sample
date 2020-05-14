package com.tiendungpham.daggersample.diexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Car @Inject constructor(
    val engine: Engine,
    val wheel: Wheel,
    val brakes: Brakes,
    val chassis: Chassis,
    val exhaust: Exhaust
) {
    @Inject
    lateinit var grille: Grille

    fun drive() {
        exhaust.viewExhaustVersion()
        grille.viewGrilleVersion()
        Log.i("MyCar ${this.hashCode()}", "Running...")
    }

    @Inject
    fun setRemote(remote: Remote) {
        remote.setRemoteController()
    }
}