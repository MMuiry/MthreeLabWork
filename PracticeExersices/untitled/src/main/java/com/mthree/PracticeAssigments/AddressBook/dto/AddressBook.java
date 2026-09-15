package com.mthree.PracticeAssigments.AddressBook.dto;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = (AddressBook) o;
        return Objects.equals(fullName, that.fullName) && Objects.equals(numberAndStreet, that.numberAndStreet) && Objects.equals(city, that.city) && Objects.equals(state, that.state) && Objects.equals(zipCode, that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, numberAndStreet, city, state, zipCode);
    }
}
