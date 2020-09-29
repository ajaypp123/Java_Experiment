package com.designpattern.structural.adapter.service;

public class MyService implements Service{

    @Override
    public void startService() {
        System.out.println("start service");
    }

    @Override
    public void stopService() {
        System.out.println("stop service");
    }

    @Override
    public void statusService() {
        System.out.println("status service");
    }
}
