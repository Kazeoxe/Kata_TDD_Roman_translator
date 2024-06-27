package romanNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class RomanNumericalKataTest {

    @Test
    void romanNumeralizeShouldRetrunValidForI() {
       var result = RomanNumericalKata.romanNumberalize("I");
       assertEquals(result, 1);
    }
    
}
