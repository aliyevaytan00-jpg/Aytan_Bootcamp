package sef.module8.activity;


import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {

        // Create a Set using HashSet
        Set<String> names = new HashSet<>();

        // Add names to the Set
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");
        names.add("Harry");
        names.add("John");

        // Print the Set
        print(names);
    }

    static void print(Set<String> set) {

        // Print all elements
        System.out.println(set);
    }
}
