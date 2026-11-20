package sef.module10.activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Builds a list of employees and prints the name of the highest paid one.
 */
public class EmployeeList {

    /**
     * Creates five employees, stores them in a list, and prints the highest paid name.
     *
     * @param args command-line arguments, unused
     */
    public static void main(String[] args) {
        Employee anna = new Employee("Analyst", "Accenture", 3000);
        anna.setName("Anna");
        anna.setAge(28);

        Employee ben = new Employee("Developer", "Google", 5500);
        ben.setName("Ben");
        ben.setAge(31);

        Employee cara = new Employee("Manager", "Microsoft", 7200);
        cara.setName("Cara");
        cara.setAge(36);

        Employee dan = new Employee("Tester", "Amazon", 4100);
        dan.setName("Dan");
        dan.setAge(27);

        Employee eva = new Employee("Designer", "Apple", 4800);
        eva.setName("Eva");
        eva.setAge(29);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(anna);
        empList.add(ben);
        empList.add(cara);
        empList.add(dan);
        empList.add(eva);

        System.out.println("The Employee whose salary is the highest is: "
                + Employee.getHighestPaidEmp(empList));
    }
}
