package com.example.daggerbinds.Car;

import javax.inject.Inject;

import okhttp3.Challenge;

public class Pride implements Engine {
    @Override
    public String setEngine(String name) {
       return name;
    }

    @Override
    public void startEngine() {
        System.out.println(setEngine("PRIDE") + " Engine Started" );
    }

    @Inject
    public Pride() {
    }
}
