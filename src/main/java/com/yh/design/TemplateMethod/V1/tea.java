package com.yh.design.TemplateMethod.V1;

public class tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("starting brew tea");
    }

    @Override
    void addCondiments() {
        System.out.println("starting addCondiments tea");

    }
}
