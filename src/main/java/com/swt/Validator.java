package com.swt;

public final class Validator {

    private Validator() {}

    public enum ErrorCode {
        NONE,
        NON_NUMERIC,
        OUT_OF_RANGE,
        INVALID_OPERATOR,
        DIVIDE_BY_ZERO
    }

    private static ErrorCode error = ErrorCode.NONE;

    public static boolean validate(String op, String sA, String sB) {
        return  checkNumeric(sA, sB) &&
                checkRange(sA, sB)   &&
                checkOperator(op)    &&
                checkDivisor(op, sB);
    }

    public static ErrorCode getError() { return error; }

    private static boolean checkNumeric(String sA, String sB) {
        try {
            Double.parseDouble(sA);
            Double.parseDouble(sB);
            return true;
        } catch (NumberFormatException ex) {
            error = ErrorCode.NON_NUMERIC;
            return false;
        }
    }

    private static boolean checkRange(String sA, String sB) {
        double a = Double.parseDouble(sA);
        double b = Double.parseDouble(sB);
        if (a < -32768 || a > 32767 || b < -32768 || b > 32767) {
            error = ErrorCode.OUT_OF_RANGE;
            return false;
        }
        return true;
    }

    private static boolean checkOperator(String op) {
        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
            error = ErrorCode.INVALID_OPERATOR;
            return false;
        }
        return true;
    }

    private static boolean checkDivisor(String op, String sB) {
        if (op.equals("/") && Double.parseDouble(sB) == 0) {
            error = ErrorCode.DIVIDE_BY_ZERO;
            return false;
        }
        return true;
    }
}
