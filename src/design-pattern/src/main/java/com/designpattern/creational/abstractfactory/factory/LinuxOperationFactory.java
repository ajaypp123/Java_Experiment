package com.designpattern.creational.abstractfactory.factory;

import com.designpattern.creational.abstractfactory.cmd.Command;
import com.designpattern.creational.abstractfactory.cmd.LinuxCommand;

public class LinuxOperationFactory implements OperationFactory {

    private static Command linuxCommand = new LinuxCommand();

    @Override
    public Command getCommand() {
        return linuxCommand;
    }
}
