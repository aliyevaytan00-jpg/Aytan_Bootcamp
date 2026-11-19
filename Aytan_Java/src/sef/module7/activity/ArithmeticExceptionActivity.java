package sef.module7.activity;


public class ArithmeticExceptionActivity {

    // Main method
    public static void main(String[] args) {

        // Create an object
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();

        // Call catchMe with 10 and 0
        obj.catchMe(10, 0);

        System.out.println("-----------------------------");

        // Call catchMe with 10 and 2
        obj.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {

        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } finally {
            System.out.println("Thank you for using this program.");
        }
    }
}
