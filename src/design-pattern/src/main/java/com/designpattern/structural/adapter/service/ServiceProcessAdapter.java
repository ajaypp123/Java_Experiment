package com.designpattern.structural.adapter.service;

import com.designpattern.structural.adapter.process.Process;

public class ServiceProcessAdapter implements Process{

    Service script;

    public ServiceProcessAdapter(Service script) {
        this.script = script;
    }

    @Override
    public void startProcess() {
        this.script.startService();
    }

    @Override
    public void stopProcess() {
        this.script.stopService();
    }

    @Override
    public void statusProcess() {
        this.script.statusService();
    }
}
