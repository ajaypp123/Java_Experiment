package com.servlet.mypackage;

public class Calculator {
    private int vara;
    private int varb;

    public Calculator() {

    }

    public Calculator(int vara, int varb){
        this.vara = vara;
        this.varb = varb;
    }


    public void setVara(int vara) {
        this.vara = vara;
    }

    public void setVarb(int varb) {
        this.varb = varb;
    }

    public int addNum() {
        return vara+varb;
    }

    public int subNum() {
        return vara-varb;
    }

    public int mulNum() {
        return vara*varb;
    }

    public int divideNum() {
        return vara/varb;
    }
}