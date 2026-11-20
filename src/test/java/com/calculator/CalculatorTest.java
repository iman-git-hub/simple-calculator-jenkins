package com.simple_calculator_jenkins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testPositiveNumber() {
        assertTrue(calculator.isPositive(5));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(calculator.isPositive(-5));
    }
}
