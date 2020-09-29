package com.designpattern.structural.bridge;

/*
* Bind bridge between color and shape
*/

class Color {
    Color(String color) {
        System.out.println("This object in " + color);
    }
}

class Circle {
    Circle(Color color) {
        System.out.println("Circle");
    }
}

class Square {
    Square(Color color) {
        System.out.println("Square");
    }
}

public class GoodExampleBridge {
    GoodExampleBridge() {
        new Square(new Color("Green"));
        new Square(new Color("Red"));
        new Circle(new Color("Green"));
        new Circle(new Color("Red"));
    }
}
