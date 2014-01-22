public class RomanNumerals {

    private static final int[] VALUES = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public String arabicToRoman(int i) {
        StringBuilder result = new StringBuilder();
        int remaining = i;

        for (int x = 0; x < VALUES.length; x++) {
            int value = VALUES[x];
            String symbol = SYMBOLS[x];
            remaining = appendRomanNumerals(remaining, value, symbol, result);
        }

        return result.toString();
    }

    private int appendRomanNumerals(int remaining, int value, String romanDigits, StringBuilder result) {
        while (remaining >= value) {
            result.append(romanDigits);
            remaining -= value;
        }
        return remaining;
    }


}
