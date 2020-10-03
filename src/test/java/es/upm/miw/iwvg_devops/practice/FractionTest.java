package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(5, 3);
    }

    @Test
    void testFraction() {
        assertEquals(5, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void testEmptyFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testSetNumerator() {
        fraction = new Fraction();
        fraction.setNumerator(5);
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        fraction = new Fraction();
        fraction.setDenominator(5);
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        fraction = new Fraction();
        fraction.setDenominator(5);
        assertEquals((double) 1 / 5, fraction.decimal());
    }
}
