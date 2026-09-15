package com.mthree.PracticeAssigments.shape;

public class Triangle extends Shape{
    private int baseSide;
    private int Side2;
    private int side3;
    private int perimeterHeight;

    public  Triangle(int baseSide, int Side2, int side3, int perimeterHeight, String color) {
        this.baseSide = baseSide;
        this.Side2 = Side2;
        this.side3 = side3;
        this.perimeterHeight = perimeterHeight;
        this.color = color;
    }
    public double getPerimeter(){
        return (baseSide+Side2+side3);
    }

    public double getArea(){
        return (double) ((baseSide*perimeterHeight)/2);
    }
}

