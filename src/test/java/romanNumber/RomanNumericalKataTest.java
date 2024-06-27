package romanNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class RomanNumericalKataTest {

    @Test
    void romanNumeralizeShouldRetrunValidForI() {
       var result = RomanNumericalKata.romanNumberalize("I");
       assertEquals(result, 1);
    }
    
    @Test
    void romanNumeralizeShouldRetrunValidForII() {
       var result = RomanNumericalKata.romanNumberalize("II");
       assertEquals(result, 2);
    }

    @Test
    void romanNumeralizeShouldRetrunValidForV() {
       var result = RomanNumericalKata.romanNumberalize("V");
       assertEquals(result, 5);
    }
}
