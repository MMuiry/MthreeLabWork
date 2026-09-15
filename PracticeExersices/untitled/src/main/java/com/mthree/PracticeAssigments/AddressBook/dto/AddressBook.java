package com.mthree.PracticeAssigments.AddressBook.dto;

public class AddressBook {
    private String fullName;
    private String numberAndStreet;
    private String city;
    private String state;
    private String zipCode;

    public AddressBook(String fullName, String numberAndStreet, String city, String state, String zipCode) {
        this.fullName = fullName;
        this.numberAndStreet = numberAndStreet;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getfullName() {
        return fullName;
    }

    public String getNumberAndStreet() {
        return numberAndStreet;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setAddress(String numberAndStreet, String city, String state, String zipCode) {
        this.numberAndStreet = numberAndStreet;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

}
