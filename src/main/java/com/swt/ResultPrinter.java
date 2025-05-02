package com.swt;

import com.swt.Validator.ErrorCode;

public final class ResultPrinter {

    private ResultPrinter() {}

    public static void printError(ErrorCode code) {
        String msg = switch (code) {
            case NON_NUMERIC      -> "Input bukan angka.";
            case OUT_OF_RANGE     -> "Angka di luar rentang -32768 s.d. 32767.";
            case INVALID_OPERATOR -> "Operator tidak valid. Gunakan +, -, *, /.";
            case DIVIDE_BY_ZERO   -> "Pembagi tidak boleh nol.";
            default               -> "Terjadi kesalahan tak terduga.";
        };
        System.out.println("Error: " + msg);
    }

    public static void printResult(double value) {
        System.out.println("Hasil = " + value);
    }
}
