package com.mthree.PracticeAssigments.CarLot.Dao;

public class NoSuchCarException extends RuntimeException {
    public NoSuchCarException(String message) {
        super(message);
    }
}
