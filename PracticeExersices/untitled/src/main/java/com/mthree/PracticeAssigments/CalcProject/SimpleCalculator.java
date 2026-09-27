package com.mthree.PracticeAssigments.CalcProject;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleCalculator {

    public static BigDecimal addition(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal subtraction(BigDecimal num1,BigDecimal num2) {
        return num1.subtract(num2).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal multiplication(BigDecimal num1,BigDecimal num2) {
        return num1.multiply(num2).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal division(BigDecimal num1,BigDecimal num2) {
        return num1.divide(num2, 2, RoundingMode.HALF_UP);
    }
}
