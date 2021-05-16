package com.chandanbhat.section8;

import java.util.Scanner;
import java.util.Arrays;

import static com.chandanbhat.section8.Arrays.printArray;

public class ArraysChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Sort the array in descending order
        int arrSize;
        System.out.print("Enter the size of the array: \r");
        arrSize = scanner.nextInt();

        int[] array = getIntegerInput(arrSize);
        printArray(array);

        sortArray(array);
        printArray(array);

        // Minimum Element Challenge
        System.out.println("Enter the count of integers to be read: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = readIntegers(count);
        int minimumElement = findMinimumElement(numbers);
        System.out.println("The minimum element of " + Arrays.toString(numbers) + " is: " + minimumElement);

        // Reverse Array Challenge
        System.out.println("Enter the size of the array to be read: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] inputArray = readIntegers(size);
        System.out.println("Array inputArray before reversing");
        printArray(inputArray);
        reverseArray(inputArray);
        System.out.println("Array inputArray after reversing");
        printArray(inputArray);
    }

    public static int[] getIntegerInput(int arrSize) {
        int[] array = new int[arrSize];
        System.out.println("Enter " + arrSize + " integers: ");
        for(int i=0 ; i< array.length ; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static void sortArray(int[] array) {
        int temp;
        for(int i=0 ; i<array.length - 1 ; i++) {
            for(int j=0 ; j< array.length-i-1 ; j++) {
                if(array[j] < array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    /**
     * Minimum Element Challenge
     * @param count Count of the integers to be read from console
     * @return Array
     */
    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for(int i=0 ; i<array.length ; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    /**
     * Finds the minimum element in the array
     * @param array Input array
     * @return The minimum element
     */
    private static int findMinimumElement(int[] array) {
        int minimumElement = array[0];
        for(int i=1 ; i<array.length ; i++) {
            if(array[i] < minimumElement) {
                minimumElement = array[i];
            }
        }
        return minimumElement;
    }

    /**
     * Reverse Array Challenge: Reverse the input array
     * @param array Array to be reversed
     */
    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}


/*
Code Challenge: Minimum Element

import java.util.Scanner;

public class MinimumElement {
    // write code here

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for(int i=0 ; i<count ; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minimum = array[0];
        for(int i=1 ; i<array.length ; i++) {
            if(array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}

 */

/*

import java.util.Arrays;

public class ReverseArray {
    // write code here

    private static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        System.out.println("Array = " + Arrays.toString(array));
        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
 */