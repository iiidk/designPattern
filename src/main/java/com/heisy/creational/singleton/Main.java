package com.heisy.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Eager eager1 = Eager.getInstance();
        Lazy lazy = Lazy.getInstance();
        StaticInnerMan staticInnerMan = StaticInnerMan.getInstance();
    }
}
