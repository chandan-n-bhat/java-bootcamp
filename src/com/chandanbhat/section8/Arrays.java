package com.chandanbhat.section8;

import java.util.Scanner;

public class Arrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaring an integer array of size 5. Note: All elements are initialized to 0
        int[] numbers = new int[5];
        printArray(numbers);

        // Declaring an Array
        int[] intArray;
        // Defining a declared array
        intArray = new int[5];
        intArray[0] = 10;
        intArray[3] = 40;
        System.out.println("0th index: " + intArray[0]);
        System.out.println("3rd index: " + intArray[3]);
        System.out.println("4th index: " + intArray[4]);

        // Declaring and defining an array using loop
        int[] intArr = new int[5];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
            System.out.println(i + "th index of intArr: " + intArr[i]);
        }

        // Declaring and initializing in a line
        int[] newNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(newNumbers);

        // Mini Challenge: Take 6 input integers from user and store them in the array and find the average
        int size = 5;
        int[] numberArray = getArrayInput(size);

        double average = findAverage(numberArray);
        System.out.println("The average of user array is: " + average);

        // Note: Changing the array passed inside a function to check if the change is reflected
        double[] doubleArr = new double[]{1, 2, 3, 4, 5};
        System.out.println("doubleArr before modification:");
        printArray(doubleArr);
        checkIfArrayModificationIsReflected(doubleArr);
        System.out.println("doubleArr after modification");
        printArray(doubleArr);
        System.out.println("NOTE: CHANGE IS REFLECTED!!!");
    }

    public static void checkIfArrayModificationIsReflected(double[] array) {
        for(int i=0 ; i<array.length ; i++) {
            array[i] = array[i] * 10;
        }
    }

    public static double findAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / (double) array.length;
    }

    public static int[] getArrayInput(int size) {
        System.out.print("Enter " + size + " integers:\r");
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }
        return input;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double ele : array) {
            System.out.print(ele + ", ");
        }
        System.out.println();
    }
}

/*
 https://www.geeksforgeeks.org/different-ways-to-achieve-pass-by-reference-in-java/?ref=rp
 https://www.geeksforgeeks.org/g-fact-31-java-is-strictly-pass-by-value/
 */