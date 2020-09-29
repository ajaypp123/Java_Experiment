package com.designpattern.Behavioral.chainofresponsibility;

class Cluster {
    private static Node node = new Node();

    public static void ServiceStart() {
        node.ServiceStart();
    }
}

class Node {
    private static Service service = new Service();
    public static void ServiceStart() {
        service.ServiceStart();
    }
}
class Service {
    public static void ServiceStart() {
        System.out.println("start service");
    }
}

public class clusterDemo {
    clusterDemo() {
        Cluster.ServiceStart();
    }
}
