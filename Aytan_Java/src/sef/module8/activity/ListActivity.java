package sef.module8.activity;


import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {

        // Create a list of names
        List<String> names = new ArrayList<>();

        // Add names to the list
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");

        // Print the list
        print(names);
    }

    static void print(List<String> list) {

        // Print each element
        for (String name : list) {
            System.out.println(name);
        }
    }
}
