package com.swt;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Operand pertama : ");
            String sA = sc.nextLine().trim();

            System.out.print("Operand kedua   : ");
            String sB = sc.nextLine().trim();

            System.out.print("Operator (+ - * /) : ");
            String op = sc.nextLine().trim();

            if (!Validator.validate(op, sA, sB)) {
                ResultPrinter.printError(Validator.getError());
                return;
            }

            double a = Double.parseDouble(sA);
            double b = Double.parseDouble(sB);
            double result = Computation.compute(op, a, b);

            ResultPrinter.printResult(result);
        }
    }
}
