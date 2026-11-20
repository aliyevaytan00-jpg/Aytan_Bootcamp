package sef.module10.activity;

/**
 * Arithmetic operations used by the calculator activity.
 * {@code add} is overloaded. Division handles invalid input internally.
 * Multiplication reports invalid input with {@link InvalidInputException}.
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param firstNumber  the first value
     * @param secondNumber the second value
     * @return the sum of the two values
     */
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Adds two floating-point numbers.
     *
     * @param firstNumber  the first value
     * @param secondNumber the second value
     * @return the sum of the two values
     */
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param firstNumber  the value to subtract from
     * @param secondNumber the value to subtract
     * @return the difference
     */
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * Divides two integers.
     * A divisor of zero is caught and reported; the method then returns zero.
     *
     * @param dividend the number to divide
     * @param divisor  the number to divide by
     * @return the quotient, or {@code 0} when the divisor is zero
     */
    public int divide(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (ArithmeticException exception) {
            System.out.println("Invalid input: " + exception.getMessage());
            return 0;
        }
    }

    /**
     * Multiplies two integers.
     * A negative factor is invalid. The exception is caught and thrown again
     * so callers still handle it.
     *
     * @param firstNumber  the first factor
     * @param secondNumber the second factor
     * @return the product of the two factors
     * @throws InvalidInputException when either factor is negative
     */
    public int multiply(int firstNumber, int secondNumber) throws InvalidInputException {
        try {
            if (firstNumber < 0 || secondNumber < 0) {
                throw new InvalidInputException("Invalid input for multiplication");
            }
            return firstNumber * secondNumber;
        } catch (InvalidInputException exception) {
            System.out.println(exception.getMessage());
            throw exception;
        }
    }
}
