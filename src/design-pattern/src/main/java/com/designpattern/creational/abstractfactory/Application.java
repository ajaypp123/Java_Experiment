package com.designpattern.creational.abstractfactory;

import com.designpattern.creational.abstractfactory.cmd.Command;
import com.designpattern.creational.abstractfactory.factory.OperationFactory;

public class Application {
    private Command cmd;

    public Application(OperationFactory factory) {
        cmd = factory.getCommand();
    }

    public void getFiles() {
        cmd.listFiles();
    }
}
