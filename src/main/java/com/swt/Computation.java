package com.swt;

public final class Computation {
    private Computation() {
    }

    public static double compute(String op, double a, double b) {
        return switch (op) {
            case "+" -> Operation.addition(a, b);
            case "-" -> Operation.subtraction(a, b);
            case "*" -> Operation.multiplication(a, b);
            case "/" -> Operation.division(a, b);
            default -> Double.NaN;
        };
    }
}
