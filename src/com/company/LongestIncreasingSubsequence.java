package com.company;

/*
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.

 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements.
 * For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 * */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int array[] = {10, 9, 2, 5, 3, 7, 101, 18, 4, 5, 6, 7, 8, 9, 123, 456};
        int max = subsequence(array);
        System.out.println(max);
    }

    public static int subsequence(int[] array) {
        int maxSequence = 0;
        int currentSequence = 0;

        for (int i = 0; i < array.length; i++) {
            if (i - 1 >= 0) {
                int previous = array[i - 1];
                if (array[i] > previous) currentSequence++;
                else {
                    if (currentSequence > maxSequence) {
                        maxSequence = currentSequence;
                        currentSequence = 1;
                    }
                }
            } else currentSequence++;
        }
        if(currentSequence > maxSequence) maxSequence = currentSequence;
        return maxSequence;
    }
}
