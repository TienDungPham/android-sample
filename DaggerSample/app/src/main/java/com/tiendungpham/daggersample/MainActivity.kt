package com.tiendungpham.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tiendungpham.daggersample.diexample.Car
import com.tiendungpham.daggersample.diexample.di.ChassisModule
import com.tiendungpham.daggersample.diexample.di.DaggerCarComponent
import com.tiendungpham.daggersample.diexample.di.DaggerPorscheComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var carOne: Car

    @Inject
    lateinit var carTwo: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .bindGrilleVersion(100)
            .buildChassisModule(ChassisModule(200)).build()
        carOne = carComponent!!.getCar()
        carOne.drive()

        carComponent.injectMainActivity(this)
        carTwo.drive()

        DaggerPorscheComponent.builder().carComponent(carComponent).build().getPorsche().car.drive()

        Log.i("MyCar", "${carComponent.getNissanComponent().getNissan().wheel} ${carOne.wheel}")
    }
}
