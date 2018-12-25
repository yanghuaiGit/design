package com.yh.design.TemplateMethod.V1;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract  void brew();
    abstract  void addCondiments();
     void boilWater(){
        System.out.println("staring boilWater");
    }
     void pourInCup(){
        System.out.println("staring pourInCup");
    }


}
