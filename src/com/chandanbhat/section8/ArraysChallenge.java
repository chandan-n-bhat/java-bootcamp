package com.chandanbhat.section8;

import java.util.Scanner;

import static com.chandanbhat.section8.Arrays.printArray;

public class ArraysChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arrSize;
        System.out.print("Enter the size of the array: \r");
        arrSize = scanner.nextInt();

        int[] array = getIntegerInput(arrSize);
        printArray(array);

        sortArray(array);
        printArray(array);
    }

    public static int[] getIntegerInput(int arrSize) {
        int[] array = new int[arrSize];
        System.out.println("Enter " + arrSize + " integers: ");
        for(int i=0 ; i< array.length ; i++) {
            array[i] = scanner.nextInt();
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
}
