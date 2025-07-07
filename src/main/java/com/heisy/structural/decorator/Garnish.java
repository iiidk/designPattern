package com.heisy.structural.decorator;

abstract class Garnish extends Food {
    private Food food;
    public Garnish(Food food, float price, String desc) {
        super(price, desc);
        this.food = food;
    }

    public Food getFood(){
        return food;
    }
}
