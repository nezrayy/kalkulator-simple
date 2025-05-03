package com.swt;

import org.testng.Assert;
import org.testng.annotations.*;

public class ValidatorTest {

    @BeforeMethod
    public void resetError() {
        Validator.resetError();
    }
    //Modul Validator.checkNumeric

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
        String sA = "0";
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


    //Modul Validator.checkDivisor
}
