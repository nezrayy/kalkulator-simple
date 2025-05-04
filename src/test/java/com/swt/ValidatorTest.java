package com.swt;

import org.testng.Assert;
import org.testng.annotations.*;

public class ValidatorTest {

    @BeforeMethod
    public void resetError() {
        Validator.resetError();
    }

    //Modul Validator.checkNumeric
    @Test
    public void checkNumeric_TC1() {
        String sA = "12.5";
        String sB = "7.0";
        boolean result = Validator.checkNumeric(sA, sB);
        Assert.assertTrue(result);
        Assert.assertEquals(Validator.ErrorCode.NONE, Validator.getError());
    }

    @Test
    public void checkNumeric_TC2() {
        String sA = "10.0";
        String sB = "abc";
        boolean result = Validator.checkNumeric(sA, sB);
        Assert.assertFalse(result);
        Assert.assertEquals(Validator.ErrorCode.NON_NUMERIC, Validator.getError());
    }

    @Test
    public void checkNumeric_TC3() {
        String sA = "xyz";
        String sB = "5.0";
        boolean result = Validator.checkNumeric(sA, sB);
        Assert.assertFalse(result);
        Assert.assertEquals(Validator.ErrorCode.NON_NUMERIC, Validator.getError());
    }

    //Modul Validator.checkRange
    @Test
    public void checkRange_TC1() {
        String sA = "38000";
        String sB = "0";
        boolean result = Validator.checkRange(sA, sB);
        Assert.assertFalse(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.OUT_OF_RANGE);
    }

    @Test
    public void checkRange_TC2() {
        String sA = "0";
        String sB = "37268";
        boolean result = Validator.checkRange(sA, sB);
        Assert.assertFalse(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.OUT_OF_RANGE);
    }

    @Test
    public void checkRange_TC3() {
        String sA = "-32769";
        String sB = "2";
        boolean result = Validator.checkRange(sA, sB);
        Assert.assertFalse(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.OUT_OF_RANGE);
    }

    @Test
    public void checkRange_TC4() {
        String sA = "-2";
        String sB = "-32770";
        boolean result = Validator.checkRange(sA, sB);
        Assert.assertFalse(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.OUT_OF_RANGE);
    }
    
    @Test
    public void checkRange_TC5() {
        String sA = "1";
        String sB = "-1";
        boolean result = Validator.checkRange(sA, sB);
        Assert.assertTrue(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.NONE);
    }
    
    //Modul Validator.checkOperator
    @Test
    public void checkOperator_TC1() {
        String op = "%";
        boolean result = Validator.checkOperator(op);
        Assert.assertFalse(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.INVALID_OPERATOR);
    }

    @Test
    public void checkOperator_TC2() {
        String op = "+";
        boolean result = Validator.checkOperator(op);
        Assert.assertTrue(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.NONE);
    }

    @Test
    public void checkOperator_TC3() {
        String op = "-";
        boolean result = Validator.checkOperator(op);
        Assert.assertTrue(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.NONE);
    }

    @Test
    public void checkOperator_TC4() {
        String op = "*";
        boolean result = Validator.checkOperator(op);
        Assert.assertTrue(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.NONE);
    }

    @Test
    public void checkOperator_TC5() {
        String op = "/";
        boolean result = Validator.checkOperator(op);
        Assert.assertTrue(result);
        Assert.assertEquals(Validator.getError(), Validator.ErrorCode.NONE);
    }

    //Modul Validator.checkDivisor
    @Test
    public void checkDivisor_TC1() {
        String op = "/";
        String sB = "0";
        boolean result = Validator.checkDivisor(op, sB);
        Assert.assertFalse(result);
        Assert.assertEquals(Validator.ErrorCode.DIVIDE_BY_ZERO, Validator.getError());
    }

    @Test
    public void checkDivisor_TC2() {
        String op = "/";
        String sB = "10";
        boolean result = Validator.checkDivisor(op, sB);
        Assert.assertTrue(result);
        Assert.assertEquals(Validator.ErrorCode.NONE, Validator.getError());
    }
}
