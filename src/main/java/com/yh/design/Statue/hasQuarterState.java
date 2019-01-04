package com.yh.design.Statue;

public class hasQuarterState implements State {
    GumballMachine gumballMachine;
    public hasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }
    @Override
    public void insertQuarter() {
    System.out.println("you can't insert any quarter");

    }

    @Override
    public void ejectquarter() {
        System.out.println("quarter return ");
        gumballMachine.setState( gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned ");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("no gumbler dispensed");
    }
}
