package com.heisy.structural.proxy;

/**
 * 静态代理类
 */
public class ProxyPoint implements SellTickets {
    private TrainSell station = new TrainSell();

    @Override
    public void sell() {
        System.out.println("代理节点收取服务费");
        station.sell();
    }
}
