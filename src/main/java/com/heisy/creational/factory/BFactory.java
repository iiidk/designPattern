package com.heisy.creational.factory;

public class BFactory implements Factory{
    @Override
    public Car createCar() {
        return new BCar();
    }

    @Override
    public Bike createBike() {
        return new BBike();
    }
}
