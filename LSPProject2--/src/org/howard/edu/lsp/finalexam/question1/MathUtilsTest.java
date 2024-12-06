package org.howard.edu.lsp.finalexam.question1; // Consider moving to a test package

import org.junit.jupiter.api.Test; // Assuming JUnit 5
import org.junit.jupiter.api.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testFactorial() {
        MathUtils mathUtils = new MathUtils();

        // Test base cases
        assertEquals(1, mathUtils.factorial(0));
        assertEquals(1, mathUtils.factorial(1));

        // Test positive numbers
        assertEquals(120, mathUtils.factorial(5));

        // Test negative input
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }

    @Test
    public void testIsPrime() {
        MathUtils mathUtils = new MathUtils();

        // Test prime numbers
        assertTrue(mathUtils.isPrime(2));
        assertTrue(mathUtils.isPrime(3));
        assertTrue(mathUtils.isPrime(5));
        assertTrue(mathUtils.isPrime(7));
        assertTrue(mathUtils.isPrime(11));

        // Test non-prime numbers
        assertFalse(mathUtils.isPrime(0));
        assertFalse(mathUtils.isPrime(1));
        assertFalse(mathUtils.isPrime(4));
        assertFalse(mathUtils.isPrime(6));
        assertFalse(mathUtils.isPrime(9));

        // Test negative input
        assertFalse(mathUtils.isPrime(-1));
    }

    @Test
    public void testGCD() {
        MathUtils mathUtils = new MathUtils();

        // Test positive numbers
        assertEquals(6, mathUtils.gcd(12, 18));
        assertEquals(1, mathUtils.gcd(7, 11));

        // Test negative numbers
        assertEquals(6, mathUtils.gcd(-12, 18));
        assertEquals(1, mathUtils.gcd(-7, -11));

        // Test zero input
        assertEquals(4, mathUtils.gcd(0, 4));
        assertEquals(5, mathUtils.gcd(5, 0));

        // Test both inputs zero
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }
}