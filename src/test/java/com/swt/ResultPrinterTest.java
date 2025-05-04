package com.swt;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResultPrinterTest {
    
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream capturer;

    @BeforeMethod
    public void redirectSystemOut() {
        capturer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturer));
    }

    @AfterMethod
    public void restoreSystemOut() {
        System.setOut(originalOut);
    }
    
    // Modul ResultPrinter.printError
    
    @Test
    public void printError_TC1() {

        ResultPrinter.printError(Validator.ErrorCode.NON_NUMERIC);

        String output = capturer.toString().trim(); // trim untuk menghilangkan \n
        Assert.assertEquals(output, "Error: Input bukan angka.");
    }
    
    @Test
    public void printError_TC2() {

        ResultPrinter.printError(Validator.ErrorCode.OUT_OF_RANGE);

        String output = capturer.toString().trim(); // trim untuk menghilangkan \n
        Assert.assertEquals(output, "Error: Angka di luar rentang -32768 s.d. 32767.");
    }
    
    @Test
    public void printError_TC3() {

        ResultPrinter.printError(Validator.ErrorCode.INVALID_OPERATOR);

        String output = capturer.toString().trim(); // trim untuk menghilangkan \n
        Assert.assertEquals(output, "Error: Operator tidak valid. Gunakan +, -, *, /.");
    }
    
    @Test
    public void printError_TC4() {

        ResultPrinter.printError(Validator.ErrorCode.DIVIDE_BY_ZERO);

        String output = capturer.toString().trim(); // trim untuk menghilangkan \n
        Assert.assertEquals(output, "Error: Pembagi tidak boleh nol.");
    }
    
    @Test
    public void printError_TC5() {

        ResultPrinter.printError(Validator.ErrorCode.NONE);

        String output = capturer.toString().trim(); // trim untuk menghilangkan \n
        Assert.assertEquals(output, "Error: Terjadi kesalahan tak terduga.");
    }

    // Modul ResultPrinter.printResult

    @Test
    public void printResult_TC1() {
        double value = 10.5;
        ResultPrinter.printResult(value);

        String output = capturer.toString().trim(); // trim untuk menghilangkan \n
        Assert.assertEquals(output, "Hasil = 10.5");
    }
}
