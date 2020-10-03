package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void testIsProper() {
        fraction = new Fraction(2, 3);
        assertTrue(fraction.isProper());
    }

    @Test
    void TestIsImproper() {
        fraction = new Fraction(2, 3);
        assertFalse(fraction.isImproper());
    }

    @Test
    void TestIsEquivalent() {
        fraction = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(4, 6);
        assertTrue(fraction.isEquivalent(fraction2));
    }

    @Test
    void TestAdd() {
        fraction = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 2);
        assertEquals( 13, fraction.add(fraction2).getNumerator());
        assertEquals( 6, fraction.add(fraction2).getDenominator());
    }

    @Test
    void TestMultiply(){
        fraction = new Fraction(2, 5);
        Fraction fraction2 = new Fraction(3, 2);
        assertEquals( 6, fraction.multiply(fraction2).getNumerator());
        assertEquals( 10, fraction.multiply(fraction2).getDenominator());
    }

    @Test
    void TestDivide(){
        fraction = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 2);
        assertEquals( 4, fraction.divide(fraction2).getNumerator());
        assertEquals( 9, fraction.divide(fraction2).getDenominator());
    }
}
