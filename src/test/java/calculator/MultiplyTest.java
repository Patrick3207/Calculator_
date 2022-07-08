package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    void testMultiply(){
        Multiply multiply = new Multiply();
        assertEquals(10,multiply.calculate(5, 2));
        assertEquals(0, multiply.calculate(0, 82));
        assertEquals(0, multiply.calculate(24, 0));
    }

}