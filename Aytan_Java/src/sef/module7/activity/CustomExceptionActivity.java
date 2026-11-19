package sef.module7.activity;


public class CustomExceptionActivity extends Exception {

    // Constructor
    public CustomExceptionActivity() {
    }

    // Override getMessage()
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}
