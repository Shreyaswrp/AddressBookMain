package com.dummyProject;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String args[]) {

        System.out.println("Welcome to Address Book Program");
        Person newPerson = new Person();
       newPerson.addPreson(); //a method to add a new person to address book
        newPerson.editDetails();//for editing existing information
    }
}
