package sef.module10.activity;

/**
 * Abstract representation of a person.
 * Subclasses provide their own introduction.
 */
public abstract class Person {

    private String name;
    private int age;

    /**
     * Creates a person with no name and age set to zero.
     */
    public Person() {
    }

    /**
     * Creates a person with the given name and age.
     *
     * @param name the person's name
     * @param age  the person's age in years
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns this person's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets this person's name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns this person's age.
     *
     * @return the age in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets this person's age.
     *
     * @param age the age in years
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Prints an introduction for this person.
     */
    public abstract void introduce();
}
