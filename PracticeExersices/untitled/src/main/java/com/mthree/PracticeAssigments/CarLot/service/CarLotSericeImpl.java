package com.mthree.PracticeAssigments.CarLot.service;

import com.mthree.PracticeAssigments.CarLot.Dao.NoSuchCarException;
import com.mthree.PracticeAssigments.CarLot.Dao.OverpaidPriceException;
import com.mthree.PracticeAssigments.CarLot.Dao.UnderpaidPriceException;
import com.mthree.PracticeAssigments.CarLot.Dto.Car;
import com.mthree.PracticeAssigments.CarLot.Dto.CarKey;

import java.math.BigDecimal;
import java.util.List;

public class CarLotSericeImpl implements CarLotService {
    @Override
    public Car getACar(String VIN) {
        return null;
    }

    @Override
    public List<Car> getAllCars() {
        return List.of();
    }

    @Override
    public List<Car> getCarsByColour(String colour) {
        return List.of();
    }

    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice) {
        return List.of();
    }

    @Override
    public List<Car> getCarByMakeAndModel(String make, String Model) {
        return List.of();
    }

    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) throws NoSuchCarException {
        return null;
    }

    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid) throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException {
        return null;
    }
}
