package com.yh.design.designInexample.reduceifelse.RuleEngine;

public enum Operator {
  MULTIPLY{
      @Override
      public int apply(int a, int b) {
          return a * b;
      }
    },

    ADD {
  @Override
  public int apply(int a, int b) {
  return a + b;
  }
    };

    public abstract int apply(int a, int b);

}
