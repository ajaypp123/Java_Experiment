package com.designpattern.creational.builder;

class Stats {
    // Stats to build complex stats framework
    public void startService() {
        System.out.println("Start Stats Service");
    }
}

class Alert {
    // Alert class
    public void startService() {
        System.out.println("Start Alert Service");
    }
}

class Account {
    // Account managment
    public void startService() {
        System.out.println("Start Account Service");
    }
}

public class Manager {

    private Alert alert;
    private Stats stats;
    private Account account;

    public Manager() {
        // Build Manager class
        alert = new Alert();
        stats = new Stats();
        account = new Account();
    }

    public void start() {
        alert.startService();
        stats.startService();
        account.startService();
    }
}
