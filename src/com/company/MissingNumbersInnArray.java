package com.company;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbersInnArray {
    public static void main(String[] args) {
        int[] num = {4, 3, 2, 7, 8, 2, 3, 1};
        for (Integer i : firstSolution(num)) {
            System.out.println(i);
        }

        for (Integer i : secondSolution(num)) {
            System.out.println(i);
        }
    }


    public static List<Integer> firstSolution(int[] nums) {
        int maxValue = nums.length;
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= maxValue; i++) {

            if (!contains(nums, i)) {
                array.add(i);
            }
        }

        return array;
    }

    private static boolean contains(int[] nums, int value) {
        for (int num : nums) {
            if (num == value) return true;
        }
        return false;
    }


    // find index = value - 1 in array and mark value as negative if the values are greater that null
    // and after that add indexes of not negative values to array
    // taaken from https://medium.com/@saurav.agg19/find-all-numbers-disappeared-in-an-array-c6a01393909
    private static List<Integer> secondSolution(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }


}
