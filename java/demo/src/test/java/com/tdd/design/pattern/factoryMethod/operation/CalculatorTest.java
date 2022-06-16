package com.tdd.design.pattern.factoryMethod.operation;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
    
    @Test
    public void shouldCalculateTwoNumbers() {
        Calculator calculator = new Calculator();
        final float result = calculator.calculate(3.6f, 4.9f, "add");
        assertEquals(8.5f, result, 0.02);
    }
}
