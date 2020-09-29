package com.designpattern.structural.flyweight;

import java.util.HashMap;

class Conf {

    Conf(String name) {
        System.out.println("Load " + name);
    }
}

class ConfFactory {

    private static HashMap<String, Conf> configs = new HashMap<>();
    private ConfFactory(){};

    static Conf getConf(String name) {
        Conf conf = (Conf)configs.get(name);

        if(conf == null) {
           conf = new Conf(name);
           configs.put(name, conf);
           System.out.println("Adding conf : " + conf);
        }
        return conf;
    }
}

public class FlyweightConfApp {
    FlyweightConfApp() {
        ConfFactory.getConf("a");
        ConfFactory.getConf("a");
        ConfFactory.getConf("a");
    }
}
