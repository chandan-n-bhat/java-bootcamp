package com.chandanbhat.section8;

import java.util.Scanner;

public class ArrayListsChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for contacts (name and phone number)
    // Create a master class (MobilePhone) that holds the ArrayList of contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available
    // Options: Quit, print list of contacts, add new contact, update existing contact, remove contact, and search contact
    // When adding or updating be sure to check if the contact already exists (use name
    // Be sure not to expose the inner workings of ArrayList to MobilePhone
    // eg. no its, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();

        boolean quit = false;
        int choice;
        while(!quit) {
            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            String name;
            String oldName;
            String phoneNumber;

            switch(choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    mobilePhone.displayContactList();
                    break;
                case 2:
                    System.out.println("Enter the contact to be stored: ");
                    System.out.print("\tName: ");
                    name = scanner.next();
                    System.out.print("\tPhone Number: ");
                    phoneNumber = scanner.next();
                    scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    mobilePhone.store(newContact);
                    break;
                case 3:
                    System.out.println("Enter the name of the contact to be updated: ");
                    oldName = scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter the new contact to be updated: ");
                    System.out.print("\tName: ");
                    name = scanner.next();
                    System.out.print("\tPhone Number: ");
                    phoneNumber = scanner.next();
                    scanner.nextLine();
                    Contact updatedContact = new Contact(name, phoneNumber);
                    mobilePhone.updateContact(oldName, updatedContact);
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Menu:");
        System.out.println("\t0 - Print Menu");
        System.out.println("\t1 - Print Contact List");
        System.out.println("\t2 - Add Contact");
        System.out.println("\t3 - Update Contact");
        System.out.println("\t4 - Remove Contact");
        System.out.println("\t5 - Search Contact");
        System.out.println("\t6 - Quit");
    }

}
