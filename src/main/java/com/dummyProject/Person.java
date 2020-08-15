package com.dummyProject;

import java.util.*;
public class Person {
    List<PersonInfo> addressBook = new ArrayList<PersonInfo>();

    //add a person to address book
    void addPreson() {
        PersonInfo person = new PersonInfo();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter person's first name");
        person.firstName = scan.nextLine();
        System.out.println("Enter person's last name");
        person.lastName = scan.nextLine();
        System.out.println("Enter person's address");
        person.address = scan.nextLine();
        System.out.println("Enter person's city");
        person.city = scan.nextLine();
        System.out.println("Enter person's state");
        person.state = scan.nextLine();
        System.out.println("Enter person's zip code");
        person.zip = scan.nextInt();
        System.out.println("Enter person's phone number");
        person.phoneNumber = scan.nextLong();

        addressBook.add(person);
        scan.close();
    }

}

