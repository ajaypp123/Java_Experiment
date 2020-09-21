package com.designpattern.creational.abstractfactory;

import com.designpattern.creational.abstractfactory.factory.LinuxOperationFactory;
import com.designpattern.creational.abstractfactory.factory.OperationFactory;
import com.designpattern.creational.abstractfactory.factory.WindowOperationFactory;

public class AbstractFactory {
    private static Application configureApplication() {
        Application app;
        OperationFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            factory = new LinuxOperationFactory();
            app = new Application(factory);
        } else {
            factory = new WindowOperationFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void abstractFactoryApp() {
        Application app = configureApplication();
        app.getFiles();
    }
}
