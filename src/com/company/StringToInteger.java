package com.company;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "    +42s";
        int value = stringToInteger(s);
        System.out.println(value);
    }

    private static int stringToInteger(String s) {
        long value = 0;
        boolean minus = false;
        String trimmed = s.trim();
        char[] array = trimmed.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '-' && i + 1 < array.length && Character.isDigit(array[i + 1])) {
                minus = true;
                continue;
            } else if (array[i] == '+') continue;
            if (!Character.isDigit(array[i])) {
                if (value != 0) return validateValue(value, minus);
                else return 0;
            } else {
                if (value != 0) value = value * 10;
                value += Character.getNumericValue(array[i]);
            }

        }
        return validateValue(value, minus);
    }

    public static int validateValue(long value, boolean minus) {
        if (minus) value = -value;
        if (value > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (value < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) value;
    }

}
