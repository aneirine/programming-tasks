package com.company;

/**
 * A peak element is an element that is strictly greater than its neighbors.
 * <p>
 * Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */

public class PeakElement {
    public static void main(String[] args) {
        int[] array = {-2147483648, -2147483647};
        System.out.println(peakElement(array));
    }

    //from max
    //linear

    private static int peakElement(int[] array) {
        int index = 0, right = 0, left = 0;
        for (int i = 0; i < array.length; i++) {
            right = Integer.MIN_VALUE;
            left = Integer.MIN_VALUE;
            int value = array[i];
            if (i - 1 >= 0) {
                //left
                left = array[i - 1];
            }
            if (i + 1 < array.length) {
                //fight
                right = array[i + 1];
            }

            if (value > left && value > right) {
                index = i;
            }

        }

        return index;
    }
}
