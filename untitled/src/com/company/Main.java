package com.company;


import java.util.Arrays;

public class Main {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                   return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,2,3,6,1};
        int k = 9;
        System.out.println(Arrays.toString(twoSum(arr, k)));

    }

}
