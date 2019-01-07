package com.yh.design.designInexample.reduceifelse.RuleEngine;

public class testMain {
    public static void main(String[] args) {
    Expression expression = new Expression(5, 5, Operator.ADD);
    RuleEngine engine = new RuleEngine();
    Integer result = engine.process(expression);
    System.out.println(result);
    result= engine.process(new Expression(5, 5, Operator.MULTIPLY));
    System.out.println(result);
    }
}
