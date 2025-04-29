package com.swt;

import com.swt.operation.*;

public final class Computation {
    private Computation() {
    }

    public static double compute(String op, double a, double b) {
        return switch (op) {
            case "+" -> Addition.addition(a, b);
            case "-" -> Subtraction.subtraction(a, b);
            case "*" -> Multiplication.multiplication(a, b);
            case "/" -> Division.division(a, b);
            default -> Double.NaN;
        };
    }
}
