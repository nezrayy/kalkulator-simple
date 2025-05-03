package com.swt;

import org.testng.Assert;
import org.testng.annotations.*;

public class OperationTest {

    // Modul Operation.addition
    @Test
    public void add_TC1_posInt() {
        double a = 150;
        double b = 12;
        double result = Operation.addition(a, b);
        Assert.assertEquals(result, 162.0);
    }

    @Test
    public void add_TC2_negInt() {
        double a = -1200;
        double b = -800;
        double result = Operation.addition(a, b);
        Assert.assertEquals(result, -2000.0);
    }

    @Test
    public void add_TC3_mixInt() {
        double a = 744;
        double b = -44;
        double result = Operation.addition(a, b);
        Assert.assertEquals(result,700.0);    
    }
    
    @Test
    public void add_TC4_mixDec() {
        double a = 500.5;
        double b = -450.3;
        double result = Operation.addition(a, b);
        Assert.assertEquals(result,50.2,1e-9);    
    }
    
    @Test
    public void add_TC5_zero() {
        double a = 0;
        double b = 0;
        double result = Operation.addition(a, b);
        Assert.assertEquals(result,0.0);    
    }

    // Modul Operation.multiplication
    @Test
    public void mul_TC1_posInt() {
        double a = 20;
        double b = 45;
        double result = Operation.multiplication(a, b);
        Assert.assertEquals(result, 900.0);
    }

    @Test
    public void mul_TC2_negInt() {
        double a = -1000;
        double b = -25;
        double result = Operation.multiplication(a, b);
        Assert.assertEquals(result, 25000.0);
    }

    @Test
    public void mul_TC3_mixInt() {
        double a = 17;
        double b = -22;
        double result = Operation.multiplication(a, b);
        Assert.assertEquals(result,-374.0);    
    }
    
    @Test
    public void mul_TC4_mixDec() {
        double a = 74.4;
        double b = -1.5;
        double result = Operation.multiplication(a, b);
        Assert.assertEquals(result,-111.6,1e-9);    
    }
    
    @Test
    public void mul_TC5_zero() {
        double a = 0;
        double b = 0;
        double result = Operation.multiplication(a, b);
        Assert.assertEquals(result,0.0);    
    }

}