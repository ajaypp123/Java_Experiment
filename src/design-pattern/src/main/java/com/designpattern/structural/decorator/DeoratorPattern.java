package com.designpattern.structural.decorator;

interface Shape {

    void draw();
}

class Cir implements Shape{

    public void draw() {
        System.out.println("Circle");
    }
}

class Triangle implements Shape{

    public void draw() {
        System.out.println("Triangle");
    }
}

abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
       this.decoratedShape = decoratedShape;
    }

    public void draw(){
       decoratedShape.draw();
    }
 }

 class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
       super(decoratedShape);
    }

    @Override
    public void draw() {
       decoratedShape.draw();
       setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
       System.out.println("Border Color: Red");
    }
 }

public class DeoratorPattern {

    public static void DeoratorPattern() {
        Shape circle = new Cir();

        Shape redCircle = new RedShapeDecorator(new Cir());

        Shape redRectangle = new RedShapeDecorator(new Triangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}