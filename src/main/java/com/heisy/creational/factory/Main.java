package com.heisy.creational.factory;

public class Main {
    public static void main(String[] args) {
        Factory afactory = new AFactory();
        //Factory bfactory = new BFactory();
        Car car = afactory.createCar();
        Bike bike = afactory.createBike();
        car.drive();
        bike.ride();
    }
}
