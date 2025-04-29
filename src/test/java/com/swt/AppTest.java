package com.swt;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

    // Test untuk penjumlahan yang valid
    @Test
    @DisplayName("Test penjumlahan 5 + 3 menghasilkan 8.0")
    public void testAddition() {
        double a = Double.parseDouble("5");
        double b = Double.parseDouble("3");
        double result = Computation.compute("+", a, b);
        assertEquals(8.0, result, "Penjumlahan 5 + 3 seharusnya menghasilkan 8.0");
    }
}
