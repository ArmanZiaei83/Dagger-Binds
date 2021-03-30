package com.example.daggerbinds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerbinds.Car.Car;
import com.example.daggerbinds.Dagger.CarComponent;
import com.example.daggerbinds.Dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;
    CarComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerCarComponent.create();
        component.inject(this);

        car.driveCar();
    }
}