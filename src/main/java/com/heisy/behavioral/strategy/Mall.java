package com.heisy.behavioral.strategy;

public class Mall {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void show(){
        strategy.show();
    }
}

