package com.heisy.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Mall mall = new Mall();
        mall.setStrategy(new StrategyA());
        mall.show();

        mall.setStrategy(new StrategyB());
        mall.show();

        mall.setStrategy(new StrategyC());
        mall.show();
    }
}
