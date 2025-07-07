package com.heisy.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Food food = new FriedNoodle();
        System.out.println(food.getDesc() + " : " + food.getPrice() + " 元");
        Food foodPro = new FriedNoodle();
        foodPro = new Egg(foodPro);
        System.out.println(foodPro.getDesc() + " : " + foodPro.cost() + " 元");
    }
}
