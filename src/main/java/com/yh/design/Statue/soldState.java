package com.yh.design.Statue;

public class soldState implements State {
    GumballMachine gumballMachine;
    public soldState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("please wait,we'are already  giving you a  gumball");

    }

    @Override
    public void ejectquarter() {
        System.out.println("sorry you already turned crank ");

    }

    @Override
    public void turnCrank() {
        System.out.println("turn twice don't give you another gumball ");

    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Oops,out of gumballs ");
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
}
