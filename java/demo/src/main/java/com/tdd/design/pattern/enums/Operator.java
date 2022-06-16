package com.tdd.design.pattern.enums;

public enum Operator {
    ADD {
        @Override
        public double apply(final double a, final double b) {
            return a + b;
        }
    }, MULTIPLY {
        @Override
        public double apply(final double a, final double b) {
            return a * b;
        }

    }, SUBTRACT {
        @Override
        public double apply(final double a, final double b) {
            return a - b;
        }

    }, DIVIDE {
        @Override
        public double apply(final double a, final double b) {
            return a / b;
        }
    };

    public abstract double apply(final double a, final double b);
}
