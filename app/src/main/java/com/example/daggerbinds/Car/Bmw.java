package com.example.daggerbinds.Car;

import javax.inject.Inject;

public class Bmw implements Brand{

    @Override
    public String setBrand(String name) {
        return name;
    }

    @Inject
    public Bmw() {
        getBrandName();
    }

    public void getBrandName (){
        System.out.println("Car Brand : " + setBrand("BMW"));
    }
}
