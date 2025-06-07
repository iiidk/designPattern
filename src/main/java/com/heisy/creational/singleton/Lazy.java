package com.heisy.creational.singleton;

public class Lazy {
    private static volatile Lazy instance;
    private Lazy(){}
    //双重检查锁:
    public static Lazy getInstance(){
        if(instance == null){
            synchronized (Lazy.class){
                if(instance == null){
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }
}
