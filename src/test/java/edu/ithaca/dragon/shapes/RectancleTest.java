package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectancleTest {

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,10));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(10,0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,0));
    }


    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(10, 5);
        assertEquals(50, myRectangle.calcArea());
        Rectangle myRectangle2 = new Rectangle(0.5, 0.4);
        assertEquals(0.2, myRectangle2.calcArea());
    }

}
