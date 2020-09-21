package com.designpattern.creational.abstractfactory.cmd;

import java.io.IOException;

public class WindowCommand implements Command {
    @Override
    public void listFiles() {
        Process process;
        try {
            process = Runtime.getRuntime().exec("dir");
            process.getOutputStream();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
