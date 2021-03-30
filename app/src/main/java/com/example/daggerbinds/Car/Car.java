package com.example.daggerbinds.Car;

import javax.inject.Inject;

public class Car {

    Engine engine;
    Model model;

    @Inject
    public Car(Engine engine, Model model) {
        this.engine = engine;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void driveCar(){
        makeSout("Car Is Driving . . . ");
    }

    private void makeSout(String message) {
        System.out.println(message);
    }
}
