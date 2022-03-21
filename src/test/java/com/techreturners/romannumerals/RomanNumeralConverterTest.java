package com.techreturners.romannumerals;

import com.techreturners.romannumerals.RomanNumeralConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {

    @Test
    public void testConvertingOneDigit(){
        assertEquals(1, RomanNumeralConverter.getDecimalNumberFor("I"));
        assertEquals(5, RomanNumeralConverter.getDecimalNumberFor("V"));
        assertEquals(10, RomanNumeralConverter.getDecimalNumberFor("X"));
    }

    @Test
    public void testConvertingTwoDigits(){
        assertEquals(2, RomanNumeralConverter.getDecimalNumberFor("II"));
        assertEquals(4, RomanNumeralConverter.getDecimalNumberFor("IV"));
        assertEquals(6, RomanNumeralConverter.getDecimalNumberFor("VI"));
        assertEquals(9, RomanNumeralConverter.getDecimalNumberFor("IX"));
        assertEquals(11, RomanNumeralConverter.getDecimalNumberFor("XI"));
        assertEquals(20, RomanNumeralConverter.getDecimalNumberFor("XX"));
    }

    @Test
    public void testConvertingThreeDigits(){
        assertEquals(3, RomanNumeralConverter.getDecimalNumberFor("III"));
        assertEquals(7, RomanNumeralConverter.getDecimalNumberFor("VII"));
        assertEquals(12, RomanNumeralConverter.getDecimalNumberFor("XII"));
    }


    @Test
    public void testConvertingFourDigits(){
        assertEquals(8, RomanNumeralConverter.getDecimalNumberFor("VIII"));
        assertEquals(13, RomanNumeralConverter.getDecimalNumberFor("XIII"));
        assertEquals(4, RomanNumeralConverter.getDecimalNumberFor("IV"));
        assertEquals(8, RomanNumeralConverter.getDecimalNumberFor("VIII"));
    }

    @Test
    public void testAllNumbers1to10(){
        assertEquals(1, RomanNumeralConverter.getDecimalNumberFor("I"));
        assertEquals(2, RomanNumeralConverter.getDecimalNumberFor("II"));
        assertEquals(3, RomanNumeralConverter.getDecimalNumberFor("III"));
        assertEquals(4, RomanNumeralConverter.getDecimalNumberFor("IV"));
        assertEquals(5, RomanNumeralConverter.getDecimalNumberFor("V"));
        assertEquals(6, RomanNumeralConverter.getDecimalNumberFor("VI"));
        assertEquals(7, RomanNumeralConverter.getDecimalNumberFor("VII"));
        assertEquals(8, RomanNumeralConverter.getDecimalNumberFor("VIII"));
        assertEquals(9, RomanNumeralConverter.getDecimalNumberFor("IX"));
        assertEquals(10, RomanNumeralConverter.getDecimalNumberFor("X"));
    }

    @Test
    public void testAllNumbers11to20(){
        assertEquals(11, RomanNumeralConverter.getDecimalNumberFor("XI"));
        assertEquals(12, RomanNumeralConverter.getDecimalNumberFor("XII"));
        assertEquals(13, RomanNumeralConverter.getDecimalNumberFor("XIII"));
        assertEquals(14, RomanNumeralConverter.getDecimalNumberFor("XIV"));
        assertEquals(15, RomanNumeralConverter.getDecimalNumberFor("XV"));
        assertEquals(16, RomanNumeralConverter.getDecimalNumberFor("XVI"));
        assertEquals(17, RomanNumeralConverter.getDecimalNumberFor("XVII"));
        assertEquals(18, RomanNumeralConverter.getDecimalNumberFor("XVIII"));
        assertEquals(19, RomanNumeralConverter.getDecimalNumberFor("XIX"));
        assertEquals(20, RomanNumeralConverter.getDecimalNumberFor("XX"));
    }

    @Test
    public void test20Plus(){
        assertEquals(21, RomanNumeralConverter.getDecimalNumberFor("XXI"));
        assertEquals(24, RomanNumeralConverter.getDecimalNumberFor("XXIV"));
        assertEquals(25, RomanNumeralConverter.getDecimalNumberFor("XXV"));
        assertEquals(28, RomanNumeralConverter.getDecimalNumberFor("XXVIII"));
    }

    @Test
    public void test30Plus(){
        assertEquals(30, RomanNumeralConverter.getDecimalNumberFor("XXX"));
        assertEquals(34, RomanNumeralConverter.getDecimalNumberFor("XXXIV"));
        assertEquals(36, RomanNumeralConverter.getDecimalNumberFor("XXXVI"));
        assertEquals(39, RomanNumeralConverter.getDecimalNumberFor("XXXIX"));
    }

    @Test
    public void test40s(){
        assertEquals(40, RomanNumeralConverter.getDecimalNumberFor("XL"));
        assertEquals(44, RomanNumeralConverter.getDecimalNumberFor("XLIV"));
        assertEquals(45, RomanNumeralConverter.getDecimalNumberFor("XLV"));
        assertEquals(49, RomanNumeralConverter.getDecimalNumberFor("XLIX"));
    }

    @Test
    public void test90s(){
        assertEquals(90, RomanNumeralConverter.getDecimalNumberFor("XC"));
        assertEquals(94, RomanNumeralConverter.getDecimalNumberFor("XCIV"));
        assertEquals(98, RomanNumeralConverter.getDecimalNumberFor("XCVIII"));
        assertEquals(99, RomanNumeralConverter.getDecimalNumberFor("XCIX"));
        assertEquals(100, RomanNumeralConverter.getDecimalNumberFor("C"));
    }
}
