package com.swt;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class AppTest {

    private PrintStream originalOut;
    private InputStream originalIn;
    private ByteArrayOutputStream capturer;

    @BeforeMethod
    public void redirectStreams() {
        originalOut = System.out;
        originalIn = System.in;
        capturer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturer));
        Validator.resetError();
    }

    @AfterMethod
    public void restoreStreams() throws IOException {
        System.setOut(originalOut);
        System.setIn(originalIn);
        capturer.close();
    }

    @Test
    public void main_TC1() {
        simulateInput("150\n12\n+\n");
        MainApp.main(null);
        assertOutputContains("Hasil = 162.0");
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.NONE);
    }

    @Test
    public void main_TC2() {
        simulateInput("10\n0\n/\n");
        MainApp.main(null);
        assertOutputContains("Error: Pembagi tidak boleh nol.");
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.DIVIDE_BY_ZERO);
    }

    @Test
    public void main_TC3() {
        simulateInput("7\n5\n%\n");
        MainApp.main(null);
        assertOutputContains("Error: Operator tidak valid");
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.INVALID_OPERATOR);
    }

    @Test
    public void main_TC4() {
        simulateInput("40000\n1\n+\n");
        MainApp.main(null);
        assertOutputContains("Error: Angka di luar rentang");
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.OUT_OF_RANGE);
    }

    @Test
    public void main_TC5() {
        simulateInput("abc\n5\n+\n");
        MainApp.main(null);
        assertOutputContains("Error: Input bukan angka.");
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.NON_NUMERIC);
    }

    /* ===================== Helper ===================== */
    private void simulateInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8)));
    }

    private void assertOutputContains(String expectedSnippet) {
        String output = capturer.toString().trim();
        Assert.assertTrue(output.contains(expectedSnippet),
                "Output tidak mengandung: " + expectedSnippet + "\nActual ==> " + output);
    }
}