package com.dummyProject;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class Person {
    Scanner scan = new Scanner(System.in);
    int count=0;
   //list to add multiple person's at a time
    List<PersonInfo> addressBook = new ArrayList<PersonInfo>();
    HashMap<String,String> personCity= new HashMap<String,String>();
    HashMap<String,String> personState= new HashMap<String,String>();

    private final int ADDRESS=1;
    private final int PHONENUMBER=5;
    private final int CITY=2;
    private final int STATE=3;
    private final int ZIP=4;
    private final int FIRSTNAME=7;
    private final int LASTNAME=6;

    //add a person to address book
    void addPreson() {
        count=count+1;
        PersonInfo person = new PersonInfo();
        System.out.println("Enter person's first name");
        String firstName = scan.nextLine();
        System.out.println("Enter person's last name");
        String lastName = scan.nextLine();
        System.out.println("Enter person's address");
        String address = scan.nextLine();
        System.out.println("Enter person's city");
        String city = scan.nextLine();
        System.out.println("Enter person's state");
        String state = scan.nextLine();
        System.out.println("Enter person's zip code");
        int zip = scan.nextInt();
        System.out.println("Enter person's phone number");
        long phoneNumber = scan.nextLong();

        // if duplicate contact present, then don't store in address book
        if(count > 1) {
            if(checkDuplicate(firstName) == false) {
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setAddress(address);
                person.setCity(city);
                person.setState(state);
                person.setZip(zip);
                person.setPhoneNumber(phoneNumber);
                addressBook.add(person);
                personCity.put(firstName,city);
                personState.put(firstName,state);
            }
            else
                System.out.println("you enter duplicate entry");
        }
        else if(count == 1) {
            person.firstName = firstName;
            person.lastName = lastName;
            person.address = address;
            person.city = city;
            person.state = state;
            person.zip = zip;
            person.phoneNumber = phoneNumber;
            addressBook.add(person);
            personCity.put(firstName,city);
            personState.put(firstName,state);
        }
    }
    void editDetails(){
        System.out.println("Enter your first name");
        String firstName=scan.nextLine();
        System.out.println("Choose options to edit the following:1.Address 2.city 3.state 4.zip 5.phoneNumber");
        int choice=scan.nextInt();
        switch(choice){

            case ADDRESS:System.out.println("Enter new address"); //editing address
                            String address=scan.nextLine();
                            for(PersonInfo p :addressBook){
                                if(p.firstName==firstName)
                                    p.address=address;
                                break;
                            }
                            break;
            case CITY:System.out.println("Enter new city"); //editing city
                        String city=scan.nextLine();
                        for(PersonInfo p:addressBook) {
                            if (p.firstName == firstName)
                                p.city = city;
                            break;
                        }
                        break;
            case STATE:System.out.println("Enter new state"); //editing state
            String state=scan.nextLine();
            for(PersonInfo p:addressBook) {
                if (p.firstName == firstName)
                    p.state = state;
                break;
            }
            break;
            case ZIP:System.out.println("Enter new pincode"); //editing pincode
            int zip=scan.nextInt();
            for(PersonInfo p:addressBook){
                if(p.firstName==firstName){
                    p.zip=zip;
                    break;
                }
            }
            break;
            case PHONENUMBER:System.out.println("Enter new phone number"); //editing phone number
            long phoneNumber=scan.nextLong();
            for(PersonInfo p : addressBook){
                if(p.firstName==firstName)
                    p.phoneNumber=phoneNumber;
                break;
            }
            break;
            default:System.out.println("Entered an  invalid choice");
        }
    }
    //for deleting a person from address book
    void deletePerson(){
        System.out.println("Enter your first name");
        String firstName=scan.nextLine();
        for(PersonInfo p:addressBook){
            if(p.firstName==firstName)
                addressBook.remove(p);
        }
    }
    //checking if there's a duplicate entry
    boolean checkDuplicate(String firstName){
        boolean isDupliate= false;
        for(PersonInfo p : addressBook){
            if(p.firstName.equals(firstName))
                isDupliate=true;
        }
    return isDupliate;
    }
    //ability to view persons by their city or state name
    void viewPerson(){

        System.out.println("Choose 1.to view by city 2.to view by state");
        int choice=scan.nextInt();
        switch (choice) {
            case 1:   System.out.println("Enter city name");
            String city = scan.nextLine();
            for (Map.Entry m : personCity.entrySet()) {
                if (city == m.getValue())
                    System.out.println(m.getKey());
            }
            break;
            case 2: System.out.println("Enter state name");
                String state = scan.nextLine();
                for (Map.Entry m : personState.entrySet()) {
                    if (state == m.getValue())
                        System.out.println(m.getKey());
                }
                break;
            default:System.out.println("Entered an invalid option");
            break;
        }
    }
    //ability to search all the persons in a city or state
    void search(){
        System.out.println("Choose 1.to search by city 2.to search by state");
        int choice=scan.nextInt();
        switch (choice) {
            case 1:System.out.println("Enter city");
            String city=scan.nextLine();
            for(PersonInfo p:addressBook){
                if(p.city== city)
                    System.out.println(p.firstName+""+p.lastName);
            }
            break;
            case 2:System.out.println("Enter state");
                String state=scan.nextLine();
                for(PersonInfo p:addressBook){
                    if(p.state== state)
                        System.out.println(p.firstName+""+p.lastName);
                }
                break;
            default:System.out.println("Entered an invalid input");
        }
    }
    void sort(){
        System.out.println("Choose the following to sort.7.Based on first name 6.Based on last name 2.Based on city name 3.Based on state name 4.Based on zipcode");
        int choice=scan.nextInt();
        switch(choice){
            case FIRSTNAME:Collections.sort(addressBook, PersonInfo.firstNameCompare); //sort by first name
                break;
            case LASTNAME:
                Collections.sort(addressBook, PersonInfo.lastNameCompare); //sort by last name
                break;
            case CITY:
                Collections.sort(addressBook, PersonInfo.cityNameCompare); //sort by city name
                break;
            case STATE:
                Collections.sort(addressBook, PersonInfo.stateNameCompare); //sort by last name
                break;
            case ZIP:
                Collections.sort(addressBook, PersonInfo.zipCodeCompare); //sort by last name
                break;
            default:
                break;
        }
    }
}

