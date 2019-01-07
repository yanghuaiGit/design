package com.yh.design.designInexample.reduceifelse.RuleEngine;



public class AddRule implements Rule {
    private Integer result;
    @Override
    public boolean evaluate(Expression expression) {
    boolean evalResult = false;
    if (expression.getOperator() == Operator.ADD) {
    this.result = expression.getX() + expression.getY();
    evalResult = true;
    }
    return evalResult;
    }

    @Override
    public Integer getResult() {
        return result;
    }
}


