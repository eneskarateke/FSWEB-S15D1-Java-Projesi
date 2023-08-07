package com.workintech.arrays.mobile;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("213124213");
       Contact ahmet = new Contact("Ahmet", "3256436354");

        phone.addNewContact(new Contact("Cem","4325432123"));
        phone.addNewContact(ahmet);
        phone.addNewContact(new Contact("Mahmut","124324534"));
        phone.addNewContact(new Contact("Cem","1243254644534"));

        phone.printContacts();



        System.out.println("Index: " + phone.findContact(ahmet));
        System.out.println("Index with String: " + phone.findContact(ahmet.getName()));
        System.out.println("Query Contact: " + phone.queryContact("Cem"));

        phone.removeContact(ahmet);
        phone.printContacts();


    }
}
