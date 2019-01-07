package com.yh.design.designInexample.reduceifelse.RuleEngine;

public interface Rule {
    boolean evaluate(Expression expression);
    Integer getResult();

}
