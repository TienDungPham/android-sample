package com.tiendungpham.daggersample.diexample.di

import com.tiendungpham.daggersample.diexample.SteeringWheel
import com.tiendungpham.daggersample.diexample.Wheel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class WheelModule {
    @Singleton
    @Provides
    fun provideSteeringWheel(): Wheel {
        return SteeringWheel()
    }
}