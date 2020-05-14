package com.tiendungpham.daggersample.diexample.di

import com.tiendungpham.daggersample.diexample.Brakes
import com.tiendungpham.daggersample.diexample.RaceBrakes
import dagger.Module
import dagger.Provides

@Module
object BrakesModule {
    @Provides
    fun provideRaceBrakes(): Brakes {
        return RaceBrakes()
    }
}