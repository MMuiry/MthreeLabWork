package com.mthree.PracticeAssigments.CarLot.Dao;

import com.mthree.PracticeAssigments.CarLot.Dto.Car;
import com.mthree.PracticeAssigments.CarLot.Dto.CarKey;

import java.math.BigDecimal;
import java.util.List;

public interface CarLotDao {
    public List<Car> getAllCars();
    public Car getACar(String VIN);
    public List<Car> getCarsByColour(String colour);
    public List<Car> getCarByMakeAndModel(String make, String model);
    public List<Car> getCarsInBudget(BigDecimal maxPrice);

    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount)
            throws NoSuchCarException;

    public CarKey sellCar(String VIN, BigDecimal cashPaid)
            throws NoSuchCarException,
            OverpaidPriceException,
            UnderpaidPriceException;
}

