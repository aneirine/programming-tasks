package com.company;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class CustomSortString {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(customSortString("cba", "abcd"));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;
        System.out.println(duration);
    }

    private static String customSortString(String order, String string) {
        order = order.toLowerCase(Locale.ROOT);
        string = string.toLowerCase(Locale.ROOT);
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] orderArray = order.toCharArray();
        for (int i = 0; i < orderArray.length; i++) {
            map.put(orderArray[i], 0);
        }

        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) != null) {
                map.put(array[i], map.get(array[i]) + 1);
                string = string.replaceFirst(String.valueOf(array[i]), "");
            }
        }

        String sorted = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character character = entry.getKey();
            for (int i = 0; i < entry.getValue(); i++) {
                sorted += character;
            }
        }

        sorted += string;


        return sorted;
    }


    // not mine
    private static String theFastestSolution(String str, String order) {
        int[] count = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            if (count[c - 'a'] > 0) {
                int addCount = count[c - 'a'];
                while (addCount > 0) {
                    sb.append(c);
                    addCount--;
                }
                count[c - 'a'] = 0;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                int addCount = count[i];
                while (addCount > 0) {
                    sb.append((char) ('a' + i));
                    addCount--;
                }
                count[i] = 0;
            }
        }
        return sb.toString();
    }

}
