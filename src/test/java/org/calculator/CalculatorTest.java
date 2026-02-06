package org.calculator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @org.junit.jupiter.api.Test
    public void add() {
        int result = Calculator.add(5, 3);
        assertEquals(8, result);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        int result = Calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int result = Calculator.multiply(5, 3);
        assertEquals(15, result);
    }

    @org.junit.jupiter.api.Test
    public void divide() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());

    }
}