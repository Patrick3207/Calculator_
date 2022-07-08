package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    Division division;

    @BeforeEach
    void init() {
        division= new Division();
    }
    @Test
    void testDivision1() {
        assertEquals(5, division.calculate(15, 3));
    }

    @Test
    void testDivision2() {
        Division division = new Division();
        assertEquals(0.5, division.calculate(5, 10));

    }

    @Test
    void testDivisionByZero() {
        Division division = new Division();
        assertThrows(ArithmeticException.class, () -> {
            division.calculate(5, 0);
        });

    }

    @Test
    void testDivisionByNegativeNumber1() {
        Division division = new Division();
        assertEquals(-5, division.calculate(10, -2));
    }

    @Test
    void testDivisionByNegativeNumber2() {
        Division division = new Division();
        assertEquals(5, division.calculate(-10, -2));
    }
}