package com.chandanbhat.section8;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private final List<Contact> contactList = new ArrayList<>();

    public List<Contact> getContactList() {
        return contactList;
    }

    public void displayContactList() {
        System.out.println("Contact List:");
        for(Contact contact: contactList) {
            System.out.println("\t" + contact.toString());
        }
    }

    public void store(Contact contact) {
        if(contactList.contains(contact)){
            System.out.println("Contact " + contact + " already exists");
        } else {
            contactList.add(contact);
            System.out.println(contact + " added to Contact List");
        }
    }

    public void remove(Contact contact) {
        if(contactList.contains(contact)) {
            contactList.remove(contact);
            System.out.println(contact + " removed from Contact List");
        } else {
            System.out.println("Contact " + contact + " not found in Contact List");
        }
    }

    public void updateContact(String oldName, Contact contact) {
        if(contactList.contains(contact)) {
            int position = contactList.indexOf(contact);
            contactList.set(position, contact);
            System.out.println("Contact List updated with " + contact);
        } else {
            System.out.println("Contact " + contact + " not found in the Contact List");
        }
    }

    public int searchContact(Contact contact) {
        return contactList.indexOf(contact);
    }
}

