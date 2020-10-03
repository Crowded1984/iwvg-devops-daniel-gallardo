package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;

public class SearchesTest {

    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction() {
        assertEquals(List.of("F", "B", "L", "B"),
                new Searches().findUserFamilyNameInitialBySomeProperFraction()
                        .collect(Collectors.toList()));
    }
}
