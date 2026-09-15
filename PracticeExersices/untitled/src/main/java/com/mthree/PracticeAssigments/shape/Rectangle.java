package com.mthree.PracticeAssigments.shape;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width, String color){
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getPerimeter(){
        return (height*2) + (width*2);
    }

    public double getArea(){
        return (height*width);
    }
}
