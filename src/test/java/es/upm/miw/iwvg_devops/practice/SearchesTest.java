package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SearchesTest {

    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction() {
        assertEquals(List.of("F", "B", "L", "B"),
                new Searches().findUserFamilyNameInitialBySomeProperFraction()
                        .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalImproperFractionByUserName() {
        assertEquals(List.of(-0.0),
                new Searches().findDecimalImproperFractionByUserName("Antonio")
                        .collect(Collectors.toList()));
    }

    @Test
    void testFindUserIdByAllProperFraction() {
        assertEquals(new ArrayList<String>(),
                new Searches().findUserIdByAllProperFraction()
                        .collect(Collectors.toList()));
    }

    @Test
    void testFindFractionMultiplicationByUserFamilyName() {
        assertEquals(12, new Searches().findFractionMultiplicationByUserFamilyName("López").getNumerator());
        assertEquals(-240, new Searches().findFractionMultiplicationByUserFamilyName("López").getDenominator());
    }

}
