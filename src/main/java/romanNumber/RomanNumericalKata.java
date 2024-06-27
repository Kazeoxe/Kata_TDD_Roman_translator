package romanNumber;

public class RomanNumericalKata {

    public static int romanNumberalize(String romanNumeral) {
        switch (romanNumeral) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral: " + romanNumeral);
        }
    }
}
