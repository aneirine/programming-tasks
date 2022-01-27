package com.company;

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(count(n));
    }

    private static int count(int n) {
        n = n + 1;
        return fib(n);
    }

    /**
     * Solution with recursion and fibbonachi
     */
    private static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
