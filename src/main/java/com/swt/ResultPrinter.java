package com.swt;

public final class ResultPrinter {

    private ResultPrinter() {}

    public static void printResult(double value) {
        System.out.println("Hasil = " + value);
    }

    public static void printNonNumericError() {
        System.out.println("Input bukan angka.");
    }
    public static void printRangeError() {
        System.out.println("Angka di luar rentang -32768 s.d. 32767.");
    }
    public static void printOperatorError() {
        System.out.println("Operator tidak valid. Gunakan +, -, *, /.");
    }
    public static void printDivisorError() {
        System.out.println("Pembagi tidak boleh nol.");
    }
}
