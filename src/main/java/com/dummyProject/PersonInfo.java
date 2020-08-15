package com.dummyProject;

public class PersonInfo {

    String address;
    String firstName;
    String lastName;
    String city;
    String state;
    int zip;
    long phoneNumber;

    public String toString(){
        return "firstName"+firstName+"lastName"+lastName+"city"+city+"state"+state+"zip"+zip+"phoneNumber"+phoneNumber;
    }
}
