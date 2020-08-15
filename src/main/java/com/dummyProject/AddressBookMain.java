package com.dummyProject;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String args[]) {

        System.out.println("Welcome to Address Book Program");
        PersonInfo person = new PersonInfo();
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first name");
        person.firstName=scan.nextLine();
        System.out.println("Enter your last name");
        person.lastName=scan.nextLine();
        System.out.println("Enter your city");
        person.city=scan.nextLine();
        System.out.println("Enter your state");
        person.state=scan.nextLine();
        System.out.println("Enter your pin code");
        person.zip=scan.nextInt();
        System.out.println("Enter your phone number");
        person.phoneNumber=scan.nextLong();
        scan.close();
    }
}
