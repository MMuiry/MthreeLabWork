package com.mthree.PracticeAssigments.ClassRoster.dao;

//This is the error class for our application. It extends Exception.
public class ClassRosterPersistenceException extends Exception{

    public ClassRosterPersistenceException(String message) {
        super(message);
    }

    public ClassRosterPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

}