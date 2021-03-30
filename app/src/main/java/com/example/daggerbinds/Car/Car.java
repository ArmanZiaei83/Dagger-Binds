package com.example.daggerbinds.Car;

import androidx.leanback.app.BrandedSupportFragment;

import javax.inject.Inject;

public class Car {

    Engine engine;
    Brand brand;

    @Inject
    public Car(Engine engine, Brand brand) {
        this.engine = engine;
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void driveCar(){
        engine.startEngine();
        brand.setBrand("BMW");
        makeSout("Car Is Driving . . . ");
    }

    private void makeSout(String message) {
        System.out.println(message);
    }
}
