package sef.module10.activity;

/**
 * Runs the employee and student introductions.
 */
public class AbstractActivity {

    /**
     * Creates an employee and a student and prints both introductions.
     *
     * @param args command-line arguments, unused
     */
    public static void main(String[] args) {
        Employee employee = new Employee("Aytan", 26, "QA", "Accenture", 2000);
        employee.introduce();

        Students student = new Students("Elvin", 26, "ADA University");
        student.introduce();
    }
}
