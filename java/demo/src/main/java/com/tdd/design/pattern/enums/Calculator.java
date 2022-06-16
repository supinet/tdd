package com.tdd.design.pattern.enums;

public class Calculator {
    public double calculate(final double a, final double b, Operator operator) {
        return operator.apply(a, b);
    }
}
