package com.example.daggerbinds.Dagger;

import androidx.annotation.BinderThread;
import androidx.room.PrimaryKey;

import com.example.daggerbinds.Car.Bmw;
import com.example.daggerbinds.Car.Brand;
import com.example.daggerbinds.Car.Engine;
import com.example.daggerbinds.Car.Pride;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class CarModule {

    @Binds
    abstract Engine bindCarEngine (Pride pride);

    @Binds
    abstract Brand bindCarBrand(Bmw bmw);
}
