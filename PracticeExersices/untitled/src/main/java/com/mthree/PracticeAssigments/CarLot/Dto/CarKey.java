package com.mthree.PracticeAssigments.CarLot.Dto;

public class CarKey {
    private String VIN;
    private boolean laserCut;

    public CarKey(String VIN) {
        this.VIN = VIN;
    }
    public String getVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
    public boolean getIsLaserCut() {
        return laserCut;
    }
    public void setIsLaserCut(boolean laserCut) {
        this.laserCut = laserCut;
    }
}
