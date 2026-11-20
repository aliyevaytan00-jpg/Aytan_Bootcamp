package sef.module10.activity;

/**
 * Checked exception raised when a calculation receives an invalid input.
 */
public class InvalidInputException extends Exception {

    /**
     * Creates an exception with the given message.
     *
     * @param message description of the invalid input
     */
    public InvalidInputException(String message) {
        super(message);
    }
}
