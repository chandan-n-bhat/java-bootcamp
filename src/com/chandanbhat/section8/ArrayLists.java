package com.chandanbhat.section8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("ArrayList class implements the List interface in java. Unlike arrays List provide most of" +
                " the functionality such as auto-resizing, size, find etc\n");

        List<String> groceryList = new ArrayList<>();
        groceryList.add("Milk");
        groceryList.add("Cheese");
        printInstructions();

        String item;
        boolean quit = false;
        int choice;
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printGroceryList(groceryList);
                    break;
                case 2:
                    System.out.print("Enter the item to be added to the Grocery List: ");
                    item = scanner.next();
                    scanner.nextLine();
                    addItem(groceryList, item);
                    break;
                case 3:
                    System.out.print("Enter the item to be modified in the Grocery List: ");
                    item = scanner.next();
                    scanner.nextLine();
                    System.out.print("Enter the new item: ");
                    String newItem = scanner.next();
                    scanner.nextLine();
                    modifyItem(groceryList, item, newItem);
                    break;
                case 4:
                    System.out.print("Enter the item to be removed from the Grocery List: ");
                    item = scanner.next();
                    scanner.nextLine();
                    removeItem(groceryList, item);
                    break;
                case 5:
                    System.out.println("Enter the item to be searched in the Grocery List: ");
                    item = scanner.next();
                    scanner.nextLine();
                    int position = searchItemInGroceryList(groceryList, item);
                    if (position == -1) {
                        System.out.println("Item " + item + " not found");
                    } else {
                        System.out.println("Item " + item + " is present at position " + (position + 1));
                    }
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    printInstructions();
            }
        }
    }

    private static void printInstructions() {
        System.out.println("Menu: ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    private static void printGroceryList(List<String> groceryList) {
        System.out.println("Grocery List: ");
        for (String item : groceryList) {
            System.out.println("\t> " + item);
        }
    }

    private static void addItem(List<String> groceryList, String item) {
        System.out.println("Adding " + item + " to the Grocery List");
        groceryList.add(item);
    }

    private static void modifyItem(List<String> groceryList, String item, String newItem) {
        if (!groceryList.contains(item)) {
            System.out.println("Grocery List cannot be modified as the item is not present in the Grocery List");
        } else {
            int position = searchItemInGroceryList(groceryList, item);
            groceryList.set(position, newItem);
            System.out.println("Grocery List modified. From " + item + " to " + newItem);
        }
    }

    private static void removeItem(List<String> groceryList, String item) {
        if (!groceryList.contains(item)) {
            System.out.println("Item not present in the Grocery List");
        } else {
            groceryList.remove(item);
            System.out.println("Item " + item + " removed from the Grocery List");
        }
    }

    private static int searchItemInGroceryList(List<String> groceryList, String item) {
        return groceryList.indexOf(item);
    }

    private static void copyingArrayLists(List<String> arrayList) {

        List<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(arrayList);

        List<String> anotherArrayList = new ArrayList<>(arrayList);

        String[] newArrayFromArrayList = new String[anotherArrayList.size()];
        newArrayFromArrayList = anotherArrayList.toArray(newArrayFromArrayList);

        System.out.println(Arrays.toString(newArrayFromArrayList));
    }
}