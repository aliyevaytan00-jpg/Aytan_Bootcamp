package sef.module10.activity;

/**
 * A student enrolled at a university.
 * The class name follows the activity wording.
 */
public class Students extends Person {

    private String schoolName;

    /**
     * Creates a student with no details set.
     */
    public Students() {
    }

    /**
     * Creates a student enrolled at the given school.
     *
     * @param schoolName the university name
     */
    public Students(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * Creates a student with a name, age, and school.
     *
     * @param name       the student's name
     * @param age        the student's age in years
     * @param schoolName the university name
     */
    public Students(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    /**
     * Returns the university name.
     *
     * @return the school name
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the university name.
     *
     * @param schoolName the school name
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * Prints where this student studies.
     */
    @Override
    public void introduce() {
        System.out.println("I study in university " + schoolName);
    }
}
