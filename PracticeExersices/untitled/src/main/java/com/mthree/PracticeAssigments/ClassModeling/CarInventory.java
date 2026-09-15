package com.mthree.PracticeAssigments.ClassModeling;

public class CarInventory {
    private double cost;
    private String brand;
    private String model;
    private int seats;
    private String condition;
    private String colour;
    private boolean isSold = false;
    private static int NumCars = 0;


public CarInventory(double cost, String brand, String model, int seats, String condition, String colour) {
    this.cost = cost;
    this.brand = brand;
    this.model = model;
    this.seats = seats;
    this.condition = condition;
    this.colour = colour;
    NumCars++;
    }

    public static int getNumCars(){
        return NumCars;
    }

    public void setCarPrice(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
    public void setSeats(int seats) {}

    public String getCarBrand() {
        return brand;
    }

    public String getCarModel() {
        return model;
    }

    public int getCarSeats() {
        return seats;
    }

    public String getCarCondition() {
        return condition;
    }

    public void getCarColour() {
        this.colour = colour;
    }

    public void sold(){
        NumCars--;
        isSold = true;

    }

}
