package com.tdd.design.pattern.factoryMethod.operation;

public class Calculator {

    public float calculate (final float a, final float b, final String operator) {
        Operation targetOperation = OperatorFactory
            .getOperation(operator)
            .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetOperation.apply(a, b);
    }
    
}
