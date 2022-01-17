package com.company;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] n = {3, 0, 1};

        System.out.println(firstSolution(n));
        System.out.println(secondSolution(n));
    }

    /**
     * We need to find the sum of elements in array, then calculate the actual sum
     * which should be for such number of elements
     * After that just subtract the sum of the elements from the actual sum
     * <p>
     * Runtime: 1 ms, faster than 65.64% of Java online submissions for Missing Number.
     * Memory Usage: 48 MB, less than 35.67% of Java online submissions for Missing Number.
     */
    public static int firstSolution(int[] nums) {
        int sum = 0;
        int actualSum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            actualSum += i;
        }
        return actualSum - sum;
    }

    /**
     * Solving with an arithmetic progression
     *
     * Runtime: 1 ms, faster than 65.64% of Java online submissions for Missing Number.
     * Memory Usage: 47.8 MB, less than 43.27% of Java online submissions for Missing Number.
     */
    public static int secondSolution(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        int n = nums.length;
        return n * (n + 1) / 2 - sum;
    }


}
