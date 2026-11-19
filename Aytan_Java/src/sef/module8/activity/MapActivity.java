package sef.module8.activity;


import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {

        // Create a HashMap
        Map<String, String> names = new HashMap<>();

        // Add key-value pairs
        names.put("1", "John");
        names.put("2", "Mike");
        names.put("3", "Harry");
        names.put("4", "Daniel");

        // Create an instance of MapActivity
        MapActivity obj = new MapActivity();

        // Call print method
        obj.print(names);
    }

    void print(Map<String, String> map) {

        // Print keys and values
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey()
                    + ", Name: " + entry.getValue());
        }
    }
}
