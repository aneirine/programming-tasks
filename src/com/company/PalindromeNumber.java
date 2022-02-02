package com.company;

public class PalindromeNumber {
    /***
     * Given an integer x, return true if x is palindrome integer.

     An integer is a palindrome when it reads the same backward as forward.

     For example, 121 is a palindrome while 123 is not.*/
    public static void main(String[] args) {
        System.out.println(solution(11));
    }

    //my solution
    /**
     * Runtime: 7 ms, faster than 83.89% of Java online submissions for Palindrome Number.
     * Memory Usage: 42.3 MB, less than 19.81% of Java online submissions for Palindrome Number.
     * Next challenges:
     * */
    public static boolean solution(int number){
        boolean palindrome = true;
        String str = String.valueOf(number);
        int length = str.length();

        if(length % 2 != 0){
            length -= 1;
        }
        char strChar [] = str.toCharArray();
        char array [] = new char[length /2];
        for(int i = 0 ; i < length /2; i++){
            array[i] = strChar[i];
        }

        char array2 [] = new char[length /2];
        int count = 0;
        for(int i = strChar.length - 1; i >= 0; i--){
            if(count == array2.length) break;
            array2[count] = strChar[i];
            count++;
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] != array2[i]) return false;
        }

        return palindrome;
    }
}
