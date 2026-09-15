package com.mthree.PracticeAssigments.AddressBook.dao;

public class AddressBookException extends RuntimeException {

    public AddressBookException(String message) {
        super(message);
    }

    public AddressBookException(String message, Throwable cause) {
        super(message, cause);
    }

}