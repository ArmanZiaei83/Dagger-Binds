package com.example.daggerbinds.Car;

import javax.inject.Inject;

public class Bmw implements Brand{

    @Override
    public String setBrand(String name) {
        System.out.println("Car Brand : " + name);
        return name;
    }

    @Inject
    public Bmw() {
    }
}
