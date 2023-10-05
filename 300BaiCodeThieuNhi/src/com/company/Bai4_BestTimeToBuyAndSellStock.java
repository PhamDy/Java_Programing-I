package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Bai4_BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;

        LinkedList<Integer> maxPrice = new LinkedList<Integer>();

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j]-prices[i]>0) {
                    maxPrice.add(prices[j]-prices[i]);
                } else {
                    continue;
                }
            }
        }
        int max = 0;
        for (int i: maxPrice
             ) {
            if (maxPrice.getFirst()<i) {
                 max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        int a = Integer.MAX_VALUE;
        System.out.println(a);
    }
}
