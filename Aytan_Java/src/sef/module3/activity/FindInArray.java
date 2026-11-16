package sef.module3.activity;

public class FindInArray {

    public static void main(String[] args) {

        int[] nums = {100, 1, 4, 15};

        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}