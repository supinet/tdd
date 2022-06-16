package com.tdd.design.pattern.factoryMethod.operation;

public class Addition implements Operation {

    @Override
    public float apply (final float a, final float b) {
        return a + b;
    }

    
}
