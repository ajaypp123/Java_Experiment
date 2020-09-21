package com.designpattern.creational.abstractfactory.factory;

import com.designpattern.creational.abstractfactory.cmd.Command;

public interface OperationFactory {

	public Command getCommand();
}
