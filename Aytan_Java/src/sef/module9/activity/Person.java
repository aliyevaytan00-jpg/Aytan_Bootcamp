package sef.module9.activity;


public class Person {

    private int weight;
    private float height;

    // Getter for weight
    public int getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Getter for height
    public float getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Calculate BMI and return its classification
     */
    public String getBodyMassIndex(double weight, double height) {

        // Check invalid inputs
        if (weight <= 0 || weight > 600 || height <= 0 || height > 3.0) {
            return "Invalid input";
        }

        // Calculate BMI
        double bmi = weight / (height * height);

        // Return BMI classification
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
