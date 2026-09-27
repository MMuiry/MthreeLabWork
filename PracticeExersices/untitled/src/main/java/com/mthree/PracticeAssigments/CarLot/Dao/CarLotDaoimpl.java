package com.mthree.PracticeAssigments.CarLot.Dao;

import com.mthree.PracticeAssigments.CarLot.Dto.Car;
import com.mthree.PracticeAssigments.CarLot.Dto.CarKey;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarLotDaoimpl implements CarLotDao {
    Map<String, Car> cars;
    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars.values());
    }

    @Override
    public Car getACar(String VIN) {
        Car foundCar = cars.get(VIN);
        return foundCar;
    }

    @Override
    public List<Car> getCarsByColour(String colour) {
        List<Car> colouredCar =  new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getColor().equals(colour)) {
                colouredCar.add(car);
            }
        }
        return colouredCar;
    }

    @Override
    public List<Car> getCarByMakeAndModel(String make, String model) {
        List<Car> matchingCar =  new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getMake().equals(make) && car.getModel().equals(model)) {
                matchingCar.add(car);
            }
        }
        return matchingCar;
    }

    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice) {
        List<Car> matchingCar =  new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getPrice().compareTo(maxPrice) <= 0) {
                matchingCar.add(car);
            }
        }
        return matchingCar;
    }

    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) throws NoSuchCarException {
        Car discountCar =  cars.get(VIN);
        BigDecimal discountPrice = discountCar.getPrice().subtract(percentDiscount.multiply(discountCar.getPrice())).setScale(2, BigDecimal.ROUND_HALF_UP);
        discountCar.setPrice(discountPrice);
        return discountPrice;
    }

    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid) throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException {
        return null;
    }
}
