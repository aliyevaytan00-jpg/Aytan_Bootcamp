package sef.module10.activity;

import java.util.List;

/**
 * An employee, described by a job, a company, and a salary.
 */
public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;

    /**
     * Creates an employee with no details set.
     */
    public Employee() {
    }

    /**
     * Creates an employee with a name and age.
     *
     * @param name the employee's name
     * @param age  the employee's age in years
     */
    public Employee(String name, int age) {
        super(name, age);
    }

    /**
     * Creates an employee with a job title, company, and salary.
     *
     * @param jobTitle the job title
     * @param company  the company name
     * @param salary   the salary
     */
    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Creates a fully described employee.
     *
     * @param name     the employee's name
     * @param age      the employee's age in years
     * @param jobTitle the job title
     * @param company  the company name
     * @param salary   the salary
     */
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Returns the job title.
     *
     * @return the job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the job title.
     *
     * @param jobTitle the job title
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Returns the company name.
     *
     * @return the company name
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company name.
     *
     * @param company the company name
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Returns the salary.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary.
     *
     * @param salary the salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Prints this employee's introduction, including job and salary.
     */
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old");
        System.out.println("I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    /**
     * Returns the name of the employee with the highest salary.
     * When several employees share that salary, the first one in the list is returned.
     *
     * @param empList employees to compare
     * @return the name of the highest-paid employee, or an empty string when the list is empty
     */
    public static String getHighestPaidEmp(List<Employee> empList) {
        if (empList == null || empList.isEmpty()) {
            return "";
        }

        Employee highestPaid = empList.get(0);
        for (Employee employee : empList) {
            if (employee.getSalary() > highestPaid.getSalary()) {
                highestPaid = employee;
            }
        }
        return highestPaid.getName();
    }
}
