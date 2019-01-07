package com.yh.design.designInexample.reduceifelse.RuleEngine;

public class MultiplyRule implements Rule {
    private Integer result;

    @Override
    public boolean evaluate(Expression expression) {
        boolean evalResult = false;
        if (expression.getOperator() == Operator.MULTIPLY) {
            this.result = expression.getX() * expression.getY();
            evalResult = true;
        }
        return evalResult;
    }

    @Override
    public Integer getResult() {
        return result;
    }
}
