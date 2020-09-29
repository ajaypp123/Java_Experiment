package com.designpattern.structural.adapter;

import com.designpattern.structural.adapter.service.MyService;
import com.designpattern.structural.adapter.service.ServiceProcessAdapter;

class AdapterMain {
    ServiceProcessAdapter service;

    AdapterMain() {
        service = new ServiceProcessAdapter(new MyService());
        service.startProcess();
    }
}