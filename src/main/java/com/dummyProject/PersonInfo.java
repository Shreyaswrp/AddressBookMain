package com.dummyProject;

import java.util.Comparator;
public class PersonInfo {

    String address;
    String firstName;
    String lastName;
    String city;
    String state;
    int zip;
    long phoneNumber;


    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setState(String state) {
        this.state = state;
    }

    void setZip(int zipCode) {
        this.zip = zipCode;
    }

    void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getAddress() {
        return address;
    }

    String getCity() {
        return city;
    }

    String getState() {
        return state;
    }

    int getZipCode() {
        return zip;
    }

    long getPhoneNumber() {
        return phoneNumber;
    }

    static Comparator<PersonInfo> firstNameCompare = new Comparator<PersonInfo>() {
        public int compare(PersonInfo p1, PersonInfo p2) {
            String firstName1 = p1.getFirstName();
            String firstName2 = p2.getFirstName();
            return firstName1.compareTo(firstName2);
        }
    };
    static Comparator<PersonInfo> lastNameCompare = new Comparator<PersonInfo>() {
        @Override
        public int compare(PersonInfo p1, PersonInfo p2) {
            String lastName1=p1.getLastName();
            String lastName2=p2.getLastName();
            return lastName1.compareTo(lastName2);
        }
    };
    static Comparator<PersonInfo> cityNameCompare = new Comparator<PersonInfo>() {
        public int compare(PersonInfo p1, PersonInfo p2) {
            String city1 = p1.getCity();
            String city2 = p2.getCity();
            return city1.compareTo(city2);
        }
    };
    static Comparator<PersonInfo> stateNameCompare = new Comparator<PersonInfo>() {
        public int compare(PersonInfo p1, PersonInfo p2) {
            String state1 = p1.getState();
            String state2 = p2.getState();
            return state1.compareTo(state2);
        }
    };
    static Comparator<PersonInfo> zipCodeCompare = new Comparator<PersonInfo>() {
        public int compare(PersonInfo p1, PersonInfo p2) {
            Integer zip1 = p1.getZipCode();
            Integer zip2 = p2.getZipCode();
            return zip1.compareTo(zip2);
        }
    };



    public String toString(){
        return "firstName"+firstName+"lastName"+lastName+"city"+city+"state"+state+"zip"+zip+"phoneNumber"+phoneNumber;
    }
}
