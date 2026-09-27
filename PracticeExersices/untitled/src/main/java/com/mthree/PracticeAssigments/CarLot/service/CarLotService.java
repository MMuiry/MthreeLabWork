package com.mthree.PracticeAssigments.CarLot.service;

import com.mthree.PracticeAssigments.CarLot.Dao.NoSuchCarException;
import com.mthree.PracticeAssigments.CarLot.Dao.OverpaidPriceException;
import com.mthree.PracticeAssigments.CarLot.Dao.UnderpaidPriceException;
import com.mthree.PracticeAssigments.CarLot.Dto.Car;
import com.mthree.PracticeAssigments.CarLot.Dto.CarKey;

import java.math.BigDecimal;
import java.util.List;

public interface CarLotService {
    public Car getACar(String VIN);
    public List<Car> getAllCars();
    public List<Car> getCarsByColour(String colour);
    public List<Car> getCarsInBudget(BigDecimal maxPrice);
    public List<Car> getCarByMakeAndModel(String make,String model);

    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount)
            throws NoSuchCarException;

    public CarKey sellCar(String VIN, BigDecimal cashPaid)
            throws NoSuchCarException,
            OverpaidPriceException,
            UnderpaidPriceException;
}
