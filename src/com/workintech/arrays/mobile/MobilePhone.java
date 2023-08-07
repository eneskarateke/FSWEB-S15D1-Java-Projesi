package com.workintech.arrays.mobile;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts=new ArrayList<>();
    }





    public boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact)) {
                return false;
            }


        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

            if (myContacts.contains(oldContact))  {
                myContacts.set(myContacts.indexOf(oldContact), newContact);

                return true;
            }

        return false;
    }

    public boolean removeContact(Contact contact) {

        if (myContacts.contains(contact))  {
                myContacts.remove(contact);
                return true;

        }


        return false;
    }

    public int findContact(Contact contact) {

        if (myContacts.contains(contact))  {

                return myContacts.indexOf(contact);


        }
        return -1;
    }
    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index != -1) {
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println(myContacts.indexOf(contact)+" --> "+contact.getName() + " --> " + contact.getPhoneNumber());
        }
    }







}
