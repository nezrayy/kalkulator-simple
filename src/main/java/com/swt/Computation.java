package com.swt;

import com.swt.operation.Addition;
import com.swt.operation.Division;
import com.swt.operation.Multiplication;
import com.swt.operation.Subtraction;

public class Computation {

    public static double compute(String op, String sA, String sB) {
        double a, b;

        try {
            a = Double.parseDouble(sA);
            b = Double.parseDouble(sB);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Input bukan angka.");
        }

        if (a < -32768 || a > 32767 || b < -32768 || b > 32767)
            throw new IllegalArgumentException("Angka di luar range -32768 s.d. 32767.");

        return switch (op) {
            case "+" -> Addition.compute(a, b);
            case "-" -> Subtraction.compute(a, b);
            case "*" -> Multiplication.compute(a, b);
            case "/" -> {
                if (b == 0) throw new IllegalArgumentException("Pembagi tidak boleh nol.");
                yield Division.compute(a, b);
            }
            default -> throw new IllegalArgumentException("Operator harus + , - , *, /.");
        };
    }
}
