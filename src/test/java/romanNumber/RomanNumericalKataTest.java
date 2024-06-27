package romanNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class RomanNumericalKataTest {

    @Test
    void romanNumeralizeShouldReturnValidForI() {
       var result = RomanNumericalKata.romanNumberalize("I");
       assertEquals(1, result);
    }

    @Test
    void romanNumeralizeShouldReturnValidForIII() {
       var result = RomanNumericalKata.romanNumberalize("III");
       assertEquals(3, result);
    }

    @Test
    void romanNumeralizeShouldReturnValidForIV() {
       var result = RomanNumericalKata.romanNumberalize("IV");
       assertEquals(4, result);
    }

    @Test
    void romanNumeralizeShouldReturnValidForV() {
       var result = RomanNumericalKata.romanNumberalize("V");
       assertEquals(5, result);
    }
    
    @Test
    void romanNumeralizeShouldReturnValidForVI() {
       var result = RomanNumericalKata.romanNumberalize("VI");
       assertEquals(6, result);
 }

    @Test
    void romanNumeralizeShouldReturnValidForX() {
       var result = RomanNumericalKata.romanNumberalize("X");
       assertEquals(10, result);
    }
}
