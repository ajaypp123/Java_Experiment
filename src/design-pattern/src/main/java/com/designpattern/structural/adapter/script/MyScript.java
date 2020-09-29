package com.designpattern.structural.adapter.script;

public class MyScript implements Script{
    @Override
    public void startScript() {
        System.out.println("start service");
    }

    @Override
    public void stopScript() {
        System.out.println("stop service");
    }

    @Override
    public void statusScript() {
        System.out.println("status service");
    }
}
