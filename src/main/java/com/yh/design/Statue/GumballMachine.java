package com.yh.design.Statue;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state =soldOutState;
    int count=0;
    public GumballMachine(int numberGumballs){
        soldOutState=new soldOutState(this);
        noQuarterState=new noQuarterState(this);
        hasQuarterState=new hasQuarterState(this);
        soldState=new soldState(this);
        this.count=numberGumballs;
        if(numberGumballs>0){
            state=noQuarterState;
        }
    }
    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectquarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    public void setState(State state){
        this.state=state;
    }
  public   void releaseBall(){
        System.out.println("A gumball comes rolling out the slot....");
        if(count !=0){
            count=count-1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
