package com.company;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] a = {1, 4, 5, 9, 13, 45, 67, 78, 89};
//        int target = 2343;
//        System.out.println(binarySearch(a, target, 0, a.length - 1));
//
        int[] forSum = {1, 2, 3, 5, 6};     //17
        System.out.println("SUM " + sum(forSum, 0));
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        int middle = (int) Math.round((double) (left + right) / 2);
        if (array[middle] == target) return middle;
        if (left == right) return -1;

        if (target > array[middle]) {
            left = middle + 1;
        } else right = middle - 1;
        return binarySearch(array, target, left, right);
    }

    public static int sum(int[] array, int nextLength) {
        if (array.length - 1 < nextLength) return 0;
        return array[nextLength] + sum(array, ++nextLength);
    }


}
