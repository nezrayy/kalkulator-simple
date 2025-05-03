package com.swt;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ComputationTest {

    @Test
    public void compute_TC1() {
        String op = "+";
        double a = 1.0;
        double b = 2.0;
        double result = Computation.compute(op, a, b);
        assertEquals(result, 3.0);
    }

    @Test
    public void compute_TC2() {
        String op = "-";
        double a = 3.0;
        double b = 4.0;
        double result = Computation.compute(op, a, b);
        assertEquals(result, -1.0);
    }

    @Test
    public void compute_TC3() {
        String op = "*";
        double a = 5.0;
        double b = 6.0;
        double result = Computation.compute(op, a, b);
        assertEquals(result, 30.0);
    }

    @Test
    public void compute_TC4() {
        String op = "/";
        double a = 7.0;
        double b = 8.0;
        double result = Computation.compute(op, a, b);
        assertEquals(result, 0.875, 1e-9);
    }

    @Test
    public void compute_TC5() {
        String op = "#";
        double a = 9.0;
        double b = 10.0;
        double result = Computation.compute(op, a, b);
        assertEquals(result, Double.NaN);
    }
}
