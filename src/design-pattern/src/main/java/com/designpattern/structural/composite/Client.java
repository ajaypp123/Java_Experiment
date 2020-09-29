package com.designpattern.structural.composite;

public class Client {

    public static void getCompositePattern() {
        Component HpMouse = new Leaf("HP Mouse", 700);
        Component HpKeyBoard = new Leaf("HP key Mouse", 700);
        Component DellMouse = new Leaf("Dell Mouse", 700);
        Component DellKeybord = new Leaf("Dell key Mouse", 700);

        Composite key = new Composite("key");
        Composite mouse = new Composite("mouse");
        Composite eletronic = new Composite("eletronic");

        eletronic.addComponent(key);
        eletronic.addComponent(mouse);
        key.addComponent(HpKeyBoard);
        key.addComponent(DellKeybord);
        mouse.addComponent(HpMouse);
        mouse.addComponent(DellMouse);

        eletronic.showPrice();
    }
}
