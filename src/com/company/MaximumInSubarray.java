package com.company;

public class MaximumInSubarray {
    public static void main(String[] args) {
        System.out.println(solutionFirst(new int[]{-2,1}));
    }


    //my solution
    //Input: nums  = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: [4,-1,2,1] has the largest sum = 6.
    //[-2,1]

    //[5,4,-1,7,8]
    //not always working
    public static int solutionFirst(int[] nums) {
        if (nums.length == 1) return nums[0];

        int result = Integer.MIN_VALUE;
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int sumPrevious = nums[i] + nums[i - 1]; // -1
            if(sumPrevious > currentSum){ // -1 > -2
                currentSum = Math.max(currentSum, nums[i]);
            } else {
                currentSum += nums[i];
            }
            result = Math.max(currentSum, result);

        }
        return result;
    }
    //            int value = nums[i];
//            if (value >= currentSum) {
//                currentSum = value;
//            } else currentSum += value;
//            result = Math.max(result, currentSum);

}
