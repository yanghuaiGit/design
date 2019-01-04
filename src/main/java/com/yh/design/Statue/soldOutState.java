package com.yh.design.Statue;

public class soldOutState implements State {
    GumballMachine gumballMachine;
    public soldOutState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }
    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectquarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
