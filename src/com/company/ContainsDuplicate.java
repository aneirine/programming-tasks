package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2};
        System.out.println(duplicate(array));
    }

    //fast solution
    private static boolean duplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}
