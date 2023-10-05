package com.company;

import java.util.Arrays;

public class bai1_TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,7,8,10,0,3};
        int k = 3;
        System.out.println(Arrays.toString(twoSum(arr, k)));
    }


}
