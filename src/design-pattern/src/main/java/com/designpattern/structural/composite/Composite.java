package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

// category of shop item
public class Composite implements Component{

    String name;
    List<Component> components = new ArrayList<>();

    Composite(String name) {
        this.name = name;
    }

    void addComponent(Component comp) {
        components.add(comp);
    }

    @Override
    public void showPrice() {
        for (Component component : components) {
            component.showPrice();
        }
    }
}
