package sef.module10.activity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Tests for {@link Calculator}.
 * Covers both overloaded {@code add} methods, subtraction, division
 * (including division by zero), and multiplication (including invalid input).
 */
public class CalculatorTest {

    private Calculator calculator;

    /**
     * Creates a new calculator before each test.
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * Adds two positive integers.
     */
    @Test
    public void testAddPositiveIntegers() {
        assertEquals(9, calculator.add(4, 5));
    }

    /**
     * Adds integers that include a negative value.
     */
    @Test
    public void testAddIntegersWithNegativeValue() {
        assertEquals(2, calculator.add(-3, 5));
    }

    /**
     * Adds two floating-point numbers.
     */
    @Test
    public void testAddDoubles() {
        assertEquals(6.5, calculator.add(2.5, 4.0), 0.0001);
    }

    /**
     * Adds a floating-point number and zero.
     */
    @Test
    public void testAddDoubleAndZero() {
        assertEquals(3.25, calculator.add(3.25, 0.0), 0.0001);
    }

    /**
     * Subtracts to a positive result.
     */
    @Test
    public void testSubtractPositiveResult() {
        assertEquals(7, calculator.subtract(10, 3));
    }

    /**
     * Subtracts to a negative result.
     */
    @Test
    public void testSubtractNegativeResult() {
        assertEquals(-4, calculator.subtract(5, 9));
    }

    /**
     * Divides two integers that produce a whole quotient.
     */
    @Test
    public void testDivideValidInput() {
        assertEquals(4, calculator.divide(20, 5));
    }

    /**
     * Divides by zero and checks that the exception is handled.
     */
    @Test
    public void testDivideByZeroIsHandled() {
        assertEquals(0, calculator.divide(20, 0));
    }

    /**
     * Multiplies two positive integers.
     */
    @Test
    public void testMultiplyPositiveIntegers() throws InvalidInputException {
        assertEquals(42, calculator.multiply(6, 7));
    }

    /**
     * Multiplies by zero, which is a valid input.
     */
    @Test
    public void testMultiplyByZero() throws InvalidInputException {
        assertEquals(0, calculator.multiply(8, 0));
    }

    /**
     * Multiplies with a negative factor and checks the custom exception.
     */
    @Test
    public void testMultiplyNegativeInputThrowsException() {
        try {
            calculator.multiply(-3, 4);
            fail("Expected InvalidInputException for a negative factor");
        } catch (InvalidInputException exception) {
            assertEquals("Invalid input for multiplication", exception.getMessage());
        }
    }
}
