package com.yh.design.Statue;

public class noQuarterState implements State {
    GumballMachine gumballMachine;
    public noQuarterState(GumballMachine gumballMachine){
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
