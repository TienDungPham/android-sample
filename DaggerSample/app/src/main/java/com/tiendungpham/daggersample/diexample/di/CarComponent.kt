package com.tiendungpham.daggersample.diexample.di

import com.tiendungpham.daggersample.MainActivity
import com.tiendungpham.daggersample.diexample.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelModule::class, BrakesModule::class, ChassisModule::class])
interface CarComponent {

    fun getCar(): Car
    fun injectMainActivity(mainActivity: MainActivity)
    fun getNissanComponent(): NissanComponent

    @Component.Builder
    interface Builder {
        fun build(): CarComponent?
        fun buildChassisModule(chassisModule: ChassisModule): Builder

        @BindsInstance
        fun bindGrilleVersion(@Named("grille version") grilleVersion: Int): Builder
    }
}