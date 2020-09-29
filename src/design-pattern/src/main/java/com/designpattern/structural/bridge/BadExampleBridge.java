package com.designpattern.structural.bridge;

class RedCircle {
    RedCircle() {
        System.out.println("Red Circle");
    }
}

class GreenCircle {
    GreenCircle() {
        System.out.println("Green Circle");
    }
}

public class BadExampleBridge {
    BadExampleBridge() {
        new RedCircle();
        new GreenCircle();
    }
}
