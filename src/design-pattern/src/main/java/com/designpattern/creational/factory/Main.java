package com.designpattern.creational.factory;

public class Main {

    public static void factoryExample(){
        ClusterManager cluster = ClusterFactory.getCluster("one");
        System.out.println(cluster.getCluster());
    }
}
