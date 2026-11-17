package sef.module5.activity;


public class Employee_I extends Person_I {

    private double salary;
    private String title;

    // Default constructor
    public Employee_I() {
        System.out.println("I'm an Employee_I Constructor");
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }
}

