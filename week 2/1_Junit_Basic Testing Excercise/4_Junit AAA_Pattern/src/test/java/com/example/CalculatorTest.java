package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("Setting up Calculator...");
        calc = new Calculator(); // Arrange
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down Calculator...\n");
        calc = null;
    }

    @Test
    public void testAddition() {
        // Act
        int result = calc.add(10, 5);

        // Assert
        assertEquals(15, result);
        System.out.println("Result of addition: " + result);
    }

    @Test
    public void testAdditionWithZero() {
        // Act
        int result = calc.add(0, 7);

        // Assert
        assertEquals(7, result);
        System.out.println("Result of addition with zero: " + result);
    }
}
