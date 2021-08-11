package com.company;

/*
https://leetcode.com/problems/zigzag-conversion/
 */
public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "ABC";
        int rows = 1;
        System.out.println("RESULT " + zigzag(s, rows));
    }


    private static String zigzag(String string, int rows) {
        char[] characters = string.toCharArray();
        int countRow = 0, countPosition = 0;
        boolean up = false;

        int size = (int)((double) string.length() / (double) rows) + (rows - 2) * rows + 1;
        String array[][] = new String[rows][rows == 1 ? string.length() : size];
        for (int i = 0; i < characters.length; i++) {
            array[countRow][countPosition] = String.valueOf(characters[i]);
            if (!up) {
                //down
                if (countRow + 1 >= array.length) {
                    if (countRow - 1 >= 0) {
                        countRow = countRow - 1;
                    }
                    countPosition++;
                    up = true;
                } else countRow++;
            } else {
                //up
                if (countRow != 0) {
                    countRow--;
                    countPosition++;
                } else {
                    up = false;
                    countRow++;
                }
            }
        }
        String converted = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != null) converted += array[i][j];
            }
        }


        return converted;
    }
}
