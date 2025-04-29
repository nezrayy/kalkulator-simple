package com.swt;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    // Test untuk penjumlahan yang valid
    @Test
    public void testAddition() {
        double a = Double.parseDouble("5");
        double b = Double.parseDouble("3");
        double result = Computation.compute("+", a, b);
        assertEquals(8.0, result, "5 + 3 = 8.0");
    }
}
