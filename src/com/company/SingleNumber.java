package com.company;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(secondSolution(new int[]{1, 2, 3, 2, 1}));
        System.out.println(firstSolution(new int[]{1, 2, 3, 2, 1}));
    }

    public static int firstSolution(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            if (map.containsKey(nums[i])) {
                flag = false;
            }
            map.put(nums[i], flag);
        }

        for (Map.Entry<Integer, Boolean> temp : map.entrySet()) {
            if (temp.getValue()) return temp.getKey();
        }
        return nums[0];
    }


    /**
     * Solution with the XOR (bit manipulation)
     * XOR will return 1 only in case if numbers are different
     * Sp< if they are the same, it will return 0
     *
     * */
    public static int secondSolution(int nums []){
        int x = 0;
        for (int a : nums) {
            x = x ^ a;
        }
        return x;
    }
}
