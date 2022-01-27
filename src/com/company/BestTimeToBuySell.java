package com.company;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuySell {
    public static void main(String[] args) {
        int profitMine = calculate(new int[]{2, 4, 1}, 0);
        int profit = calculate2(new int[]{2, 4, 1});
        System.out.println(profitMine);
        System.out.println(profit);
    }


    private static int calculate(int[] num, int profit) {
        if (num.length == 0) return profit;

        int buyValue = Integer.MAX_VALUE;
        int buyDay = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < buyValue) {
                buyValue = num[i];
                buyDay = i;
            }
        }

        for (int i = buyDay + 1; i < num.length; i++) {
            int calculated = num[i] - buyValue;
            if (calculated > profit) {
                profit = calculated;
            }
        }

        int[] newArray = new int[num.length - 1];
        for (int i = 0, k = 0; i < num.length; i++) {
            if (i == buyDay) {
                continue;
            }
            newArray[k++] = num[i];
        }

        return calculate(newArray, profit);
    }

    private static int calculate2(int[] prices) {
        int profit = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            profit = prices[i] - min;
            max = Math.max(profit, max);
        }
        return max;
    }

}
