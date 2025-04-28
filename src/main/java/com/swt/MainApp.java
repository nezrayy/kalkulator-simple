package com.swt;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Operand pertama : ");
            String op1 = sc.nextLine().trim();

            System.out.print("Operand kedua   : ");
            String op2 = sc.nextLine().trim();

            System.out.print("Operator (+ - * /) : ");
            String operator = sc.nextLine().trim();

            double result = Computation.compute(operator, op1, op2);
            System.out.println("Hasil = " + result);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}