package com.mthree.PracticeAssigments.CarLot.Dto;

import java.math.BigDecimal;

public class Car {
    private String VIN;
    private String make;
    private String model;
    private String color;

    private BigDecimal price;
    private long odometerMiles;

    private CarKey key;

    public Car(String VIN) {
        this.VIN = VIN;
    }

    public String getVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public BigDecimal getPrice() {return price;}
    public void setPrice(BigDecimal price) {this.price = price;}
}
