package com.heisy.structural.composite;

import java.util.ArrayList;

public class Composite implements Component {
    private String name;
    private ArrayList<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }
}
