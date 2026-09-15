package com.mthree.PracticeAssigments.shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
}
