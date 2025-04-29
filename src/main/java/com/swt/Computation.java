package com.swt;

import com.swt.operation.*;

public final class Computation {
    private Computation() {}
    public static double compute(String op, double a, double b) {
        return switch (op) {
            case "+" -> Addition.compute(a, b);
            case "-" -> Subtraction.compute(a, b);
            case "*" -> Multiplication.compute(a, b);
            case "/" -> Division.compute(a, b);
            default  -> Double.NaN;
        };
    }
}
