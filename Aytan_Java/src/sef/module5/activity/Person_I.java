
package sef.module5.activity;

public class Person_I {

    private String name;
    private int age;

    // Default constructor
    public Person_I() {
        System.out.println("I'm Person_I constructor");
    }

    // Parameterized constructor
    public Person_I(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }
}
