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

}
