package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractions = new ArrayList<>();
        Fraction fraction = new Fraction();
        fractions.add(fraction);
        this.user = new User("0", "Daniel", "Gallardo", fractions);
    }

    @Test
    void testUserId() {
        assertEquals("0", user.getId());
    }

    @Test
    void testUserName() {
        assertEquals("Daniel", user.getName());
    }

    @Test
    void testUserFamilyName() {
        assertEquals("Gallardo", user.getFamilyName());
    }

    @Test
    void testUserFractions() {
        Fraction fraction = new Fraction();
        assertEquals(fraction.getNumerator(), user.getFractions().get(0).getNumerator());
        assertEquals(fraction.getDenominator(), user.getFractions().get(0).getDenominator());
    }

    @Test
    void testEmptyConstructor() {
        user = new User();
        Fraction fraction = new Fraction();
        user.addFraction(fraction);
        assertEquals(fraction, user.getFractions().get(0));
    }

    @Test
    void testSetName() {
        user = new User();
        user.setName("Daniel");
        assertEquals("Daniel", user.getName());
    }

    @Test
    void testSetFamilyName() {
        user = new User();
        user.setFamilyName("Gallardo");
        assertEquals("Gallardo", user.getFamilyName());
    }

    @Test
    void testSetFractions() {
        user = new User();
        List<Fraction> fractions = new ArrayList<>();
        Fraction fraction = new Fraction();
        fractions.add(fraction);
        user.setFractions(fractions);
        assertEquals(fraction.getNumerator(), user.getFractions().get(0).getNumerator());
        assertEquals(fraction.getDenominator(), user.getFractions().get(0).getDenominator());
    }

    @Test
    void testAddFraction() {
        user = new User();
        Fraction fraction = new Fraction();
        user.addFraction(fraction);
        assertEquals(fraction, user.getFractions().get(0));
    }

    @Test
    void testFullName() {
        user = new User();
        user.setName("Daniel");
        user.setFamilyName("Gallardo");
        assertEquals("Daniel Gallardo", user.fullName());
    }

    @Test
    void testInitials() {
        user = new User();
        user.setName("Daniel");
        assertEquals("D.", user.initials());
    }
}
