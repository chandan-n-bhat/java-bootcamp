package com.chandanbhat.section8;

import java.util.Arrays;

public class ReferenceAndValueTypes {

    public static void main(String[] args) {

        // All types in java can be classified into Reference and Value types
        // All primitives are value types while Arrays, Strings and Objects are Reference types.

        int myNumber = 21;
        int anotherNumber = myNumber;

        System.out.println("myNumber: " + myNumber);
        System.out.println("anotherNumber: " + anotherNumber);

        anotherNumber = 210;

        System.out.println("myNumber: " + myNumber);
        System.out.println("anotherNumber: " + anotherNumber);

        System.out.println("We observe that changing the variable anotherNumber does not affect the value of myNumber");
        System.out.println("Integers and other primitive types are Value Types thus they are stored as independent values");

        // Reference Types

        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println("Before Modification");
        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        anotherArray[0] = 21;
        myArray[1] = 21;

        System.out.println("After Modification");
        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        System.out.println("We observe that changing the array anotherArray does affect the array myArray");
        System.out.println("Arrays, Strings and Objects are Reference Types thus anotherArray and myArray store" +
                " reference to the actual array block in memory.");
        System.out.println("In memory there exists only one block array while anotherArray and myArray are variables" +
                " that hold the reference or address of the block in memory");
        System.out.println("Thus changing one will result in changes in another as they eventually reference the same block in memory.");

        // Passing a Reference type to methods
        System.out.println("Before modification inside the method");
        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        modifyArray(myArray);
        System.out.println("After modification inside the method");
        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        System.out.println("Before modification inside the methodV2");
        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        modifyArrayV2(myArray);
        System.out.println("After modification inside the methodV2");
        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        System.out.println("When Arrays, Strings or Objects are passed as function parameters, their reference is copied" +
                " to the function parameter. Thus modification to the parameter points to the same block in memory" +
                "thus changes are observed in the argument passed.");
    }

    private static void modifyArray(int[] array) {
        array[3] = 21;
    }

    private static void modifyArrayV2(int[] array) {
        array[4] = 21;
        array = new int[]{1,2,3};
        System.out.println("array inside methodV2:" + Arrays.toString(array));
    }
}
