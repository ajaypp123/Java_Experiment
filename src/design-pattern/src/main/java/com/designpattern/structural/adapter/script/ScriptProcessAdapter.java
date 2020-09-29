package com.designpattern.structural.adapter.script;

import com.designpattern.structural.adapter.process.Process;

public class ScriptProcessAdapter implements Process{

    Script script;

    ScriptProcessAdapter(Script script) {
        this.script = script;
    }

    @Override
    public void startProcess() {
        this.script.startScript();
    }

    @Override
    public void stopProcess() {
        this.script.stopScript();
    }

    @Override
    public void statusProcess() {
        this.script.statusScript();
    }
}
