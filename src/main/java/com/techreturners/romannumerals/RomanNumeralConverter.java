package com.techreturners.romannumerals;

/**
 * The RomanNumeralConverter class has method to convert a given Roman Numeral to its decimal number.
 */
public class RomanNumeralConverter {

    /**
     * Convert the given roman numeral to its decimal number
     * This method does not check for valid combinations of the letters
     * such as if a letter is repeated more than 3 times or
     * that the letters V,L,D are not repeated
     *
     * @param romanNumeral  The Roman numeral
     * @return the equivalent decimal number
     */
    public int getDecimalNumberFor(String romanNumeral) {

        int length = romanNumeral.length();
        romanNumeral = romanNumeral.toUpperCase();
      /*
           When a letter of smaller value is to the LEFT of the letter with larger value then
           the smaller value is subtracted from the number value else it is added.
           The following code reads the roman numerals from right to left.
       */
        int index = length - 1; // Use index to read the roman Numeral from the rightmost letter

        int previousDigit = 0; //The letter to the right of the current digit

        int currentDigit ;

        //The decimal value holder
        int numberValue = 0;
        while (index >= 0){

                currentDigit = getNumericValueForLetter(romanNumeral.charAt(index));

                if (currentDigit == -1) { //Invalid/Unexpected letter for a roman numeral
                    return -1;
                }

                if (currentDigit >= previousDigit )
                    numberValue += currentDigit;
                else
                    numberValue -= currentDigit;

                index --;

                previousDigit = currentDigit;
            }
            return numberValue;

    }


    /*
    Get the decimal equivalent for one digit roman numeral - straightforward.
     */
    private int getNumericValueForLetter(char romanNumeralChar) {
        return switch (romanNumeralChar) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}
