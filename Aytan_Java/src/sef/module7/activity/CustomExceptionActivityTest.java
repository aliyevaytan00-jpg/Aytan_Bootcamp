package sef.module7.activity;


public class CustomExceptionActivityTest {

    // Main method
    public static void main(String[] args) {

        CustomExceptionActivityTest test = new CustomExceptionActivityTest();

        // Test valid usernames
        try {
            test.validateUser("John");
            test.validateUser("Mike");

            // Test invalid username
            test.validateUser("Aytan");

        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {

        // Array of valid users
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        // Flag
        int flag = 0;

        for (int i = 0; i < 4; i++) {

            // Check if username exists
            if (name.equals(validUsers[i])) {
                flag = 1;
                break;
            }
        }

        // Check if user is valid
        if (flag == 0) {
            throw new CustomExceptionActivity();
        } else if (flag == 1) {
            System.out.println("Welcome to Payroll program");
        }
    }
}
