package com.heisy.structural.decorator;

public class FriedNoodle extends Food {
    public FriedNoodle() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
