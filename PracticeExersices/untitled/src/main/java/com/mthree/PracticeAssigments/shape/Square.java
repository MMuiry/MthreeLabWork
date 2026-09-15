package com.mthree.PracticeAssigments.shape;

public class Square extends Shape{
    private double width;

    public Square(double width, String color) {
            this.width = width;
            this.color = color;
    }

    public double getPerimeter(){
        return (width*4);
    }

    public double getArea(){
        return Math.pow(width, 2);
    }
}
