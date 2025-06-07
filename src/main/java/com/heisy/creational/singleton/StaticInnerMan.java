package com.heisy.creational.singleton;

public class StaticInnerMan {
    private StaticInnerMan(){}
    private static class StaticInnerManHolder{
        private static final StaticInnerMan INSTANCE = new StaticInnerMan();
    }

    public static StaticInnerMan getInstance(){
        return  StaticInnerManHolder.INSTANCE;
    }
}
