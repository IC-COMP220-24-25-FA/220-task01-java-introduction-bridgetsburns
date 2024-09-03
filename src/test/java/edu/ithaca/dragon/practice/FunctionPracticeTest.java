package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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
    
}
