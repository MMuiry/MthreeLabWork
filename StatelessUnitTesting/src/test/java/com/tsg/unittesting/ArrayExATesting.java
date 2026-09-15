package com.tsg.unittesting;
import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ArrayExATesting {
    /*
    whatIsTheLargestNumber([1,2,3]) -> 3
    whatIsTheLargestNumber([-1,-2,-3]) -> -1
    whatIsTheLargestNumber([-4,2,3]) -> 3
    whatIsTheLargestNumber([50,-100,200]) -> 3
     */

    @Test
    public void testPositiveRanges() {
        int[] intArray = {1,2,3};
        assertEquals(3, maxOfArray(intArray),"Max of {1,2,3] should be 3");
    }

    @Test
    public void testNegativeRanges() {
        int[] intArray = {-1,-2,-3};
        assertEquals(-1, maxOfArray(intArray),"Max of {-1,-2,-3] should be -1");
    }

    @Test
    public void testSmallMix() {
        int[] intArray = {-4,2,3};
        assertEquals(3, maxOfArray(intArray),"Max of {-4,2,3] should be 3");
    }

    @Test
    public void testLargeMix() {
        int[] intArray = {50,-100,200};
        assertEquals(200, maxOfArray(intArray),"Max of {50,-100,200] should be 200");
    }
}
