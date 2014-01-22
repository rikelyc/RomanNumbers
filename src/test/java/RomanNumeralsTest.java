import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setUp() {
        romanNumerals = new RomanNumerals();


    }

    @Test
    public void one() {
        assertEquals("I", romanNumerals.arabicToRoman(1));
    }

    @Test
    public void two() {
        assertEquals("II", romanNumerals.arabicToRoman(2));
    }

    @Test
    public void three() {
        assertEquals("III", romanNumerals.arabicToRoman(3));
    }

    @Test
    public void four() {
        assertEquals("IV", romanNumerals.arabicToRoman(4));
    }

    @Test
    public void five() {
        assertEquals("V", romanNumerals.arabicToRoman(5));
    }

    @Test
    public void six() {
        assertEquals("VI", romanNumerals.arabicToRoman(6));
    }

    @Test
    public void seven() {
        assertEquals("VII", romanNumerals.arabicToRoman(7));
    }

    @Test
    public void eight() {
        assertEquals("VIII", romanNumerals.arabicToRoman(8));
    }

    @Test
    public void nine() {
        assertEquals("IX", romanNumerals.arabicToRoman(9));
    }

    @Test
    public void ten() {
        assertEquals("X", romanNumerals.arabicToRoman(10));
    }

    @Test
    public void eleven() {
        assertEquals("XI", romanNumerals.arabicToRoman(11));
    }

    @Test
    public void thirteen() {
        assertEquals("XIII", romanNumerals.arabicToRoman(13));
    }

    @Test
    public void fourteen() {
        assertEquals("XIV", romanNumerals.arabicToRoman(14));
    }

    @Test
    public void twenty() {
        assertEquals("XX", romanNumerals.arabicToRoman(20));
    }

    @Test
    public void twentySix() {
        assertEquals("XXVI", romanNumerals.arabicToRoman(26));
    }

    @Test
    public void thirty() {
        assertEquals("XXX", romanNumerals.arabicToRoman(30));
    }

    @Test
    public void fourty() {
        assertEquals("XL", romanNumerals.arabicToRoman(40));
    }

    @Test
    public void fourtySeven() {
        assertEquals("XLVII", romanNumerals.arabicToRoman(47));
    }

    @Test
    public void fifty() {
        assertEquals("L", romanNumerals.arabicToRoman(50));
    }

    @Test
    public void seventy() {
        assertEquals("LXX", romanNumerals.arabicToRoman(70));
    }

    @Test
    public void eigthy() {
        assertEquals("LXXX", romanNumerals.arabicToRoman(80));
    }

    @Test
    public void ninety() {
        assertEquals("XC", romanNumerals.arabicToRoman(90));
    }

    @Test
    public void hundred() {
        assertEquals("C", romanNumerals.arabicToRoman(100));
    }

    @Test
    public void threeHundred() {
        assertEquals("CCC", romanNumerals.arabicToRoman(300));
    }

    @Test
    public void fourHundred() {
        assertEquals("CD", romanNumerals.arabicToRoman(400));
    }

    @Test
    public void fiveHundred() {
        assertEquals("D", romanNumerals.arabicToRoman(500));
    }

    @Test
    public void nineHundred() {
        assertEquals("CM", romanNumerals.arabicToRoman(900));
    }

    @Test
    public void thousand() {
        assertEquals("M", romanNumerals.arabicToRoman(1000));
    }

    @Test
    public void _1954() {
        assertEquals("MCMLIV", romanNumerals.arabicToRoman(1954));
    }
}