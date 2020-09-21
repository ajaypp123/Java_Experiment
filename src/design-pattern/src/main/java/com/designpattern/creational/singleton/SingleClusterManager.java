package com.designpattern.creational.singleton;

import com.designpattern.creational.factory.ClusterManager;

public class SingleClusterManager implements ClusterManager{

    private static ClusterManager cluster = new SingleClusterManager();

    public static ClusterManager getInstance(){
        System.out.println("Provide single instance");
        return cluster;
    }

    private SingleClusterManager() {
        // private constructors to avoid instance
    }

    @Override
    public String getCluster() {
        return "Product One Cluster";
    }
}