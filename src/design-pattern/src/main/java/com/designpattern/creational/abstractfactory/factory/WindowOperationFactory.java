package com.designpattern.creational.abstractfactory.factory;

import com.designpattern.creational.abstractfactory.cmd.Command;
import com.designpattern.creational.abstractfactory.cmd.WindowCommand;

public class WindowOperationFactory implements OperationFactory {
    private static Command windowCommand = new WindowCommand();

    @Override
    public Command getCommand() {
        return windowCommand;
    }
}
