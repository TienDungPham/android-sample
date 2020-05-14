package com.tiendungpham.daggersample.diexample.di

import com.tiendungpham.daggersample.diexample.Porsche
import dagger.Component

@PorscheScope
@Component(dependencies = [CarComponent::class])
interface PorscheComponent {
    fun getPorsche(): Porsche
}

