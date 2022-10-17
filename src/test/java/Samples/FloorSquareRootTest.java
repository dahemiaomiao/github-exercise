package test.java.Samples;


import main.java.Samples.FloorSquareRoot;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FloorSquareRootTest {
    @Test
    public void testA() {
        assertEquals(3, FloorSquareRoot.floorSqrt(11));
    }

    @Test
    public void testB() {
        assertEquals(4, FloorSquareRoot.floorSqrt(20));
    }
}