package com.techreturners.romannumerals;

import java.io.InputStreamReader;
import java.util.Scanner;

public class RomanNumeralsConverterConsole {

    public static void main(String... args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Please enter a Roman Numeral");
        String rnInput = scanner.nextLine();
        int number = new RomanNumeralConverter().getDecimalNumberFor(rnInput);
        if (number == -1){
            System.out.println("Invalid Roman Numeral entered");
        }
        else System.out.println("You converted the Roman Numeral " + rnInput + " to the number " + number);

    }
}
