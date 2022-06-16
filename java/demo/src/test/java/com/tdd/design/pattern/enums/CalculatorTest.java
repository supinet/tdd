package com.tdd.design.pattern.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    
    @Test
    public void shouldCalculateTwoNumbers() {
        Calculator calculator = new Calculator();
        final double result = calculator.calculate(1.5, 3.5, Operator.ADD);
        assertEquals(5, result, 0.0);
    }
}
