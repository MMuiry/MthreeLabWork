package com.mthree.PracticeAssigments.CarLot.Dao;

public class UnderpaidPriceException extends RuntimeException {
    public UnderpaidPriceException(String message) {
        super(message);
    }
}
