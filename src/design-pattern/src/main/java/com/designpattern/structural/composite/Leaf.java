package com.designpattern.structural.composite;

// item in shop
public class Leaf implements Component{

    String name;
    int price;
    Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(this.name + " Price is " + price);
    }
}
