package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        // first three tests make sure 5 is returned no matter the order of the inputs
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));
        // makes sure a repeated value doesn't cause problems 

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
        // these three tests ensure an error is thrown if any or all of the values are < 0
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(85.6, FunctionPractice.calcSalePrice(100, 20, 7));
        assertEquals(85.6, FunctionPractice.calcSalePrice(100, 20, .07));
        assertEquals(85.6, FunctionPractice.calcSalePrice(100, .20, 7));
        assertEquals(85.6, FunctionPractice.calcSalePrice(100, .20, .07));
        // code should work if discount or tax is already in decimal format
        assertThrows(IllegalArgumentException.class, ()-> FunctionPractice.calcSalePrice(-100, 20, 7));
        assertThrows(IllegalArgumentException.class, ()-> FunctionPractice.calcSalePrice(100, -20, 7));
        assertThrows(IllegalArgumentException.class, ()-> FunctionPractice.calcSalePrice(100, 20, -7));
        // should throw an error if any values are negative

    }

    @Test
    public void isGoodDogTest(){
        assertEquals(true, FunctionPractice.isGoodDog(4, 1, true));
        assertEquals(true, FunctionPractice.isGoodDog(4, 1, false));
        //if dog hasnt chewed shoes in a day, they are a good dog
        assertEquals(true, FunctionPractice.isGoodDog(4, 0, true));
        // if dog fetched the paper, they are a good dog
        assertEquals(false, FunctionPractice.isGoodDog(4, 0, false));
        // if dog chewed shoes and didnt fetch the paper, they are a good dog

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(-2, 2, true));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(2, -2, true));
        // throws an error if any numeric value is negative

    }
    
    @Test
    public void findFirstLargestTest(){
       
        List<Integer> numbers1 =new ArrayList<Integer>();
            numbers1.add(4);
            numbers1.add(5);
            numbers1.add(2);
        assertEquals(1, FunctionPractice.findFirstLargest(numbers1));
       
        List<Integer> numbers2 =new ArrayList<Integer>();
            numbers2.add(5);
            numbers2.add(4);
            numbers2.add(2);
        assertEquals(0, FunctionPractice.findFirstLargest(numbers2));
        List<Integer> numbers3 =new ArrayList<Integer>();
            numbers3.add(5);
            numbers3.add(2);
            numbers3.add(5);
        assertEquals(0,  FunctionPractice.findFirstLargest(numbers3));
        List<Integer> numbers4 =new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findFirstLargest(numbers4));

    }

    @Test
    public void findLastLargestTest(){
        List<Integer> numbers1 =new ArrayList<Integer>();
            numbers1.add(4);
            numbers1.add(5);
            numbers1.add(2);
        assertEquals(1, FunctionPractice.findLastLargest(numbers1));
       
        List<Integer> numbers2 =new ArrayList<Integer>();
            numbers2.add(5);
            numbers2.add(4);
            numbers2.add(2);
        assertEquals(0, FunctionPractice.findLastLargest(numbers2));
        List<Integer> numbers3 =new ArrayList<Integer>();
            numbers3.add(5);
            numbers3.add(2);
            numbers3.add(5);
        assertEquals(2,  FunctionPractice.findLastLargest(numbers3));
        List<Integer> numbers4 =new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findFirstLargest(numbers4));
        List<Integer> numbers5 = new ArrayList<Integer>();
            numbers5.add(5);
            numbers5.add(5);
            numbers5.add(5);
        assertEquals(2, FunctionPractice.findFirstLargest(numbers5));

    }
}
