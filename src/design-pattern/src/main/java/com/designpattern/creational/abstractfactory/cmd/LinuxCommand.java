package com.designpattern.creational.abstractfactory.cmd;

import java.io.IOException;

public class LinuxCommand implements Command {
    @Override
    public void listFiles() {
        Process process;
        try {
            process = Runtime.getRuntime().exec("ls");
            process.getOutputStream();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
