package com.dummyProject;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        Person newPerson = new Person();
       newPerson.addPreson(); //a method to add a new person to address book
        newPerson.editDetails();//for editing existing information
        newPerson.deletePerson();
        System.out.println("Enter your first name");
        String firstName=sc.nextLine();
        boolean isDuplicate=newPerson.checkDuplicate(firstName);
        if(isDuplicate==true)
            System.out.println("Duplicate contact exits with"+firstName +"name");
    }
}
