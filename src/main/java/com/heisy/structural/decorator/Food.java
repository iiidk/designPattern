package com.heisy.structural.decorator;

import lombok.Data;

@Data
abstract class Food {
    private float price;
    private String desc;

    public Food(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public abstract float cost();
}
