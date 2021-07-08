package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

//    public static void main(String[] args) {
//        System.out.println(reverse(-12345345));
//
//    }
//
//    public static int reverse(int x) {
//        int reversed = 0;
//        int divided = 0;
//        while (x != 0) {
//            divided = x % 10;
//            x /= 10;
//            check(reversed, divided);
//            reversed = reversed * 10 + divided;
//        }
//
//        check(reversed, divided);
//        return reversed;
//    }
//
//    private static int check(int reversed, int divided){
//        if (reversed > Integer.MAX_VALUE || (reversed == Integer.MAX_VALUE / 10 && divided > 7)) return 0;
//        if (reversed < Integer.MIN_VALUE /10 || (reversed == Integer.MIN_VALUE / 10 && divided < -8)) return 0;
//        return reversed;
//    }
//    public static int lengthOfLongestSubstring(String s) {
//        char array[] = s.toCharArray();
//        int length = 0;
//
//        List<Character> characters = new ArrayList<>();
//        Map<Integer, List<Character>> results = new HashMap<>();
//        for (int i = 0; i < array.length; i++) {
//            Character character = array[i];
//            if (characters.contains(character)) {
//                results.put(length, new ArrayList<>(characters));
//                int index = characters.indexOf(character) + 1;
//                characters.subList(0, index).clear();
//                length = characters.size() + 1;
//            } else {
//                length++;
//            }
//            characters.add(character);
//        }
//        results.put(length, new ArrayList<>(characters));
//
//
//        int max = 0;
//        for (Map.Entry<Integer, List<Character>> temp : results.entrySet()) {
//            if (temp.getKey() > max) {
//                max = temp.getKey();
//            }
//        }
//
//        return max;
//    }
//
//
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        List<Integer> list1 = createList(nums1);
//        List<Integer> list2 = createList(nums2);
//
//        List<Integer> newList = Stream
//                .concat(list1.stream(), list2.stream())
//                .collect(Collectors.toList());
//        Collections.sort(newList);
//
//
//        double mediana = 0;
//        System.out.println("LIST SIZE " + newList.size());
//        int index = (newList.size() - 1) / 2;
//        if (newList.size() % 2 == 0) {
//
//            int a = newList.get(index);
//            int b = newList.get(index + 1);
//            mediana = (double) (a + b) / 2;
//        } else mediana = newList.get(Math.round(index));
//        System.out.println("MEDIANA " + mediana);
//        return mediana;
//    }
//
//    public static List<Integer> createList(int[] num) {
//        List<Integer> list = new ArrayList<>(num.length);
//        for (int i : num) {
//            list.add(i);
//        }
//        return list;
//    }
//
//
//    public static double findMedianSortedArraysFaster(int[] nums1, int[] nums2) {
//        int m = nums1.length, n = nums2.length;
//        int median = 0, i = 0, j = 0;
//        int firstElement = 0;
//
//        boolean condition = (m + n) % 2 == 0;
//        for (int count = 1; count <= (m + n) / 2 + 1; count++) {
////            if (i < m && j < n) {
////                if (nums1[i] <= nums2[j]) {
////                    median = nums1[i++];
////                } else {
////                    median = nums2[j++];
////                }
////            } else if (i == m) {
////                median = nums2[j++];
////            } else if (j == n) {
////                median = nums1[i++];
////            }
//            //loop here
//            if (condition) {
//                if (count == (m + n) / 2) {
//                    firstElement = median;
//                }
//            }
//        }
//
//        if (condition) return (double) (firstElement + median) / 2;
//        return median;
//    }


}
