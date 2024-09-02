package edu.ithaca.dragon.shapes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,10));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(10,0));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,0));
    }

    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(10,5);
        assertEquals(25, myTriangle.calcArea());
        Triangle myTriangle2 = new Triangle(0.10, 0.5);
        assertEquals(0.025, myTriangle2.calcArea());
    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(10,5);
        myTriangle.doubleSize();
        assertEquals(100, myTriangle.calcArea());
        Triangle myTriangle2 = new Triangle(0.10, 0.5);
        myTriangle2.doubleSize();
        assertEquals(0.1, myTriangle2.calcArea());
    }

}
