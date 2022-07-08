package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    void testSubtraction(){
        Subtraction subtraction = new Subtraction();
        assertEquals(2,subtraction.calculate(5, 3));
    }

}