package com.heisy.structural.proxy;

public class Main {
    public static void main(String[] args) {
        TrainSell sell = new TrainSell();
        sell.sell();
        ProxyPoint proxy = new ProxyPoint();
        proxy.sell();
    }
}
