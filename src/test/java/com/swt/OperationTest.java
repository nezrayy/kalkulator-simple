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

    // Modul Operation.substraction
    @Test
    public void sub_TC1_posInt() {
        double a = 100;
        double b = 71;
        double result = Operation.subtraction(a, b);
        Assert.assertEquals(result, 29.0);
    }

    @Test
    public void sub_TC2_negInt() {
        double a = -1000;
        double b = -1213;
        double result = Operation.subtraction(a, b);
        Assert.assertEquals(result, 213.0);
    }

    @Test
    public void sub_TC3_mixInt() {
        double a = 123;
        double b = -44;
        double result = Operation.subtraction(a, b);
        Assert.assertEquals(result, 167.0);
    }

    @Test
    public void sub_TC4_posFloat() {
        double a = 341.1;
        double b = 101.1;
        double result = Operation.subtraction(a, b);
        Assert.assertEquals(result, 240.0, 1e-9);  // delta untuk presisi float
    }

    @Test
    public void sub_TC5_negFloat() {
        double a = -18.5;
        double b = -2.5;
        double result = Operation.subtraction(a, b);
        Assert.assertEquals(result, -16.0, 1e-9);
    }

    @Test
    public void sub_TC6_mixFloat() {
        double a = -1080.0;
        double b = 80.0;
        double result = Operation.subtraction(a, b);
        Assert.assertEquals(result, -1160.0);
    }

    @Test
    public void sub_TC7_zero() {
        double a = 0.0;
        double b = 0.0;
        double result = Operation.subtraction(a, b);
        Assert.assertEquals(result, 0.0);
    }

    // Modul Operation.divison
    @Test
    public void div_TC1_posInt() {
        double a = 40;
        double b = 5;
        double result = Operation.division(a, b);
        Assert.assertEquals(result, 8.0);
    }

    @Test
    public void div_TC2_negInt() {
        double a = -20;
        double b = -4;
        double result = Operation.division(a, b);
        Assert.assertEquals(result, 5.0);
    }

    @Test
    public void div_TC3_mixInt() {
        double a = 30;
        double b = -6;
        double result = Operation.division(a, b);
        Assert.assertEquals(result, -5.0);
    }

    @Test
    public void div_TC4_posFloat() {
        double a = 9.0;
        double b = 1.5;
        double result = Operation.division(a, b);
        Assert.assertEquals(result, 6.0, 1e-9);   // toleransi presisi
    }

    @Test
    public void div_TC5_negFloat() {
        double a = -18.0;
        double b = -3.0;
        double result = Operation.division(a, b);
        Assert.assertEquals(result, 6.0, 1e-9);
    }

    @Test
    public void div_TC6_mixFloat() {
        double a = -14.0;
        double b = 2.0;
        double result = Operation.division(a, b);
        Assert.assertEquals(result, -7.0);
    }
}