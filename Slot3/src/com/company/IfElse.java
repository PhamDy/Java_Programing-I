package com.company;

public class IfElse {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int time1 = 20;
        String result = (time1 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
