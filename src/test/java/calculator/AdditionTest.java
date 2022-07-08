package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    Addition addition;

    @BeforeEach
    void init() {
        addition = new Addition();
    }


    @Test
    void testAddition1() {
        assertEquals(8, addition.calculate(5, 3));
    }

    @Test
    void testAddition2() {
        assertEquals(2, addition.calculate(-1, 3));


    }
}