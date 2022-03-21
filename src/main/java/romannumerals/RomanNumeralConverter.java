package romannumerals;

public class RomanNumeralConverter {

    public int getDecimalNumberFor(String romanNumeral) {

        int length = romanNumeral.length();

        if (length >  2){
            // for numbers longer than 3 roman digits, get the
            // value of the rightmost 2 digits and add it to
            // the left most digit values when reading from right to left.
            int rightMost2digits = getTwoDigitValue(romanNumeral.substring(length-2));
            int index = length - 3;
            int numberValue = rightMost2digits;
            int previousDigit = 0; int currentDigit = 0;
            while (index >= 0){
                currentDigit = getOneDigit(romanNumeral.charAt(index));
                if (currentDigit >= previousDigit )
                    numberValue += currentDigit;
                else
                    numberValue -= currentDigit;
                index --;
                previousDigit = currentDigit;
            }
            return numberValue;
        }
        else if (length == 2) {
           return getTwoDigitValue(romanNumeral);
        }
        else if (length == 1){
            return getOneDigit(romanNumeral.charAt(0));
        }
        return -1;
    }

    /*
    Get the decimal value for a 2 -digit roman numeral.
    Includes the logic for determining the value of a number based on the position of the
    letters for digits greater than 1.
     */
    private int getTwoDigitValue(String romanNumeralStr){
        int unitValue = getOneDigit(romanNumeralStr.charAt(1));
        int tensValue = getOneDigit(romanNumeralStr.charAt(0));
        if ( unitValue > tensValue )
            return unitValue - tensValue;
        else
            return  unitValue + tensValue;
    }

    /*
    Get the decimal equivalent for one digit roman numeral - straightforward.
     */
    private int getOneDigit(char romanNumeralChar) {
       switch (romanNumeralChar){
           case 'I': return 1;
           case 'V' : return 5;
           case 'X' : return 10;
           case 'L' : return 50;
       }
       throw new RuntimeException("Unsupported Roman Numeral Character");
    }
}
