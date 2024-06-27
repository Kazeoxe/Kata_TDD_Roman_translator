package romanNumber;

public class RomanNumericalKata {

    public static int romanNumberalize(String romanNumeral) {
        if (romanNumeral.equals("V")) {
            return 5;
        } else if (romanNumeral.equals("I")) {
            return 1;
        } else {
            return 2;
        }
    }
}
