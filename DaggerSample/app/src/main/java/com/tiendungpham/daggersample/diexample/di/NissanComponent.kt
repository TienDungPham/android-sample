package com.tiendungpham.daggersample.diexample.di

import com.tiendungpham.daggersample.diexample.Nissan
import dagger.Subcomponent

@Subcomponent()
interface NissanComponent {
    fun getNissan(): Nissan
}