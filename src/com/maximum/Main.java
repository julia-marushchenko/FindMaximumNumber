// Java program to find maximum number in array of integer numbers
package com.maximum;

// Main class
public class Main {

    // Method main to run java program
    public  static void main (String [] str){

        // Creating array of integer numbers
        int array [] = {21, 17, 27, 35, 99, 107, 74, 81, 3, 1, 62};

        // Value of maximumNumber
        int maximum = Main.findMaximumNumber(array);

        // Printing maximum number
        System.out.println("Maximum number: " + maximum);
    }

    // Method to find maximum number in array of numbers
    public static int findMaximumNumber(int [] arr){
        int max = arr [0];
        for (int value: arr){
            if (value > max){
                max = value;
            }
        }
        return max;
    }
}
