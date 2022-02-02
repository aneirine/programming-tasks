package com.company;

import java.util.*;

public class StringAnagrams {
    /**
     *
     * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "cbaebabacd", p = "abc"
     * Output: [0,6]
     * Explanation:
     * The substring with start index = 0 is "cba", which is an anagram of "abc".
     * The substring with start index = 6 is "bac", which is an anagram of "abc".*/
    public static void main(String[] args) {
        List<Integer> result = findAnagrams( "cbaebabacd", "abc");
        result.forEach(System.out::println);
    }

    //works but slow
    //my solution
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        List<Character> characters = new ArrayList<>();
        for (char chart : p.toCharArray()) {
            characters.add(chart);
        }
        Collections.sort(characters);

        char [] elements = s.toCharArray();
        for(int i = 0 ; i < elements.length; i++){
            List<Character> localCharacters = new ArrayList<>();
            if(i + characters.size() <= elements.length){
            for(int j = i; j <= (i + characters.size() -1); j++){
                localCharacters.add(elements[j]);
            }
                Collections.sort(localCharacters);
            if(compare(localCharacters, characters)) {
                result.add(i);
            }
            }
        }

        return result;

    }

    private static boolean compare(List<Character> localCharacters, List<Character> characters) {
        for(int i = 0; i < characters.size(); i++){
            if(!localCharacters.get(i).equals(characters.get(i))){
                return false;
            }
        }
        return true;
    }
}
