package com.example.daggerbinds.Dagger;

import com.example.daggerbinds.MainActivity;

import dagger.Component;

@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
