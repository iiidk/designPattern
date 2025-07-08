package com.heisy.structural.proxy;

public class Main {
    public static void main(String[] args) {
        TrainSell sell = new TrainSell();
        sell.sell();
        ProxyPoint proxy = new ProxyPoint();
        proxy.sell();

        //动态代理
        JDKProxyFactory jdkProxyFactory = new JDKProxyFactory();
        jdkProxyFactory.getProxyObject().sell();

        CGLibProxyFactory cglibProxyFactory = new CGLibProxyFactory();
        cglibProxyFactory.getProxyObject().sell();
    }
}
