package romannumerals;

public class RomanNumeralConverter {

    public int getDecimalNumberFor(String romanNumeral) {

        int length = romanNumeral.length();

      /*
           When a letter of smaller value is to the RIGHT of the letter with larger value then
           the smaller value is subtracted from the number value else it is added.
           The following code reads the roman numerals from left to right.
       */
            int index = length - 1;

            int numberValue = 0; //The decimal value holder
            int previousDigit = 0; //The letter to the right of the current digit

            int currentDigit = 0;

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


    /*
    Get the decimal equivalent for one digit roman numeral - straightforward.
     */
    private int getOneDigit(char romanNumeralChar) {
       switch (romanNumeralChar){
           case 'I': return 1;
           case 'V' : return 5;
           case 'X' : return 10;
           case 'L' : return 50;
           case 'C' : return 100;
       }
       throw new RuntimeException("Unsupported Roman Numeral Character");
    }
}
