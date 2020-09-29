package com.designpattern;

import com.designpattern.creational.abstractfactory.AbstractFactory;
import com.designpattern.creational.builder.Manager;
import com.designpattern.creational.factory.Main;
import com.designpattern.creational.singleton.SingleClusterManager;
import com.designpattern.structural.composite.Client;
/**
 * Hello world!
 * java -classpath src/design-pattern/target/design-pattern-1.0-SNAPSHOT.jar com.designpattern.App
*/
public class App {
    public static void main( String[] args ) {
        // Creation design pattern

        // Factory Pattern
        Main.factoryExample();

        // Singleton Pattern
        SingleClusterManager.getInstance();

        // Abstract Factory
        AbstractFactory.abstractFactoryApp();

        // Builder class
        Manager manager = new Manager();
        manager.start();


        // Structural

        //composite
        Client.getCompositePattern();
    }
}
