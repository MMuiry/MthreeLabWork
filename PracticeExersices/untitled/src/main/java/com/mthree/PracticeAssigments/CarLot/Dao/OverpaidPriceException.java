package com.mthree.PracticeAssigments.CarLot.Dao;

public class OverpaidPriceException extends RuntimeException {
    public OverpaidPriceException(String message) {
        super(message);
    }
}
