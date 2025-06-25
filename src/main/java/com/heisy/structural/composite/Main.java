package com.heisy.structural.composite;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("leaf-1"));
        root.add(new Leaf("leaf-2"));
        root.add(new Leaf("leaf-3"));
        Composite composite1 = new Composite("node-1");
        root.add(composite1);
        composite1.add(new Leaf("leaf-4"));
        composite1.add(new Leaf("leaf-5"));

        root.operation();
    }
}
