package com.heisy.structural.decorator;

public class Egg extends Garnish {
    public Egg(Food food) {
        super(food, 1, "鸡蛋🥚");
    }

    @Override
    public float cost() {
        return getPrice() + getFood().getPrice();
    }

    public String getDesc() {
        return super.getDesc() + getFood().getDesc();
    }
}
