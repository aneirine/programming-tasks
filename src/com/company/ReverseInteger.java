package com.company;

/*
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * */
public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123423479;
        int reversed = reverseInteger(x);
        System.out.println(reversed);
    }
//-974324321

    private static int reverseInteger(int x) {
        long reversed = 0;
        while (x != 0) {
            if (reversed != 0) reversed = reversed * 10;
            int value = x % 10;
            System.out.println("V " + value);
            reversed += value;
            x = x / 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) return 0;
        return (int) reversed;
    }
}
