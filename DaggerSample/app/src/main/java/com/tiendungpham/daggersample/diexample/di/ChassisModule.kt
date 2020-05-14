package com.tiendungpham.daggersample.diexample.di

import com.tiendungpham.daggersample.diexample.BasicChassis
import com.tiendungpham.daggersample.diexample.Chassis
import dagger.Module
import dagger.Provides

@Module
class ChassisModule constructor(val weight: Int) {
    @Provides
    fun provideInt(): Int {
        return weight
    }

    @Provides
    fun provideBasicChassis(): Chassis {
        return BasicChassis(weight)
    }
}