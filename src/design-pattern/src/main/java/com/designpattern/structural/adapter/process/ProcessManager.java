package com.designpattern.structural.adapter.process;

public class ProcessManager implements Process{

    Process process;

    ProcessManager(Process process) {
        this.process = process;
    }

    @Override
    public void startProcess() {
        System.out.println("start process");
        process.startProcess();
    }

    @Override
    public void stopProcess() {
        System.out.println("stop process");
        process.stopProcess();
    }

    @Override
    public void statusProcess() {
        System.out.println("status process");
        process.statusProcess();
    }
}