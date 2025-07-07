package com.heisy.structural.proxy;

public class TrainSell implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站购票");
    }
}
