package com.designpattern.creational.factory;

class ClusterFactory {

    private ClusterFactory(){}

    public static ClusterManager getCluster(String cluster) {
        if (cluster == "one") {
            return new ProductOneClusterManager();
        } else {
            return new ProductTwoClusterManager();
        }
    }
}
