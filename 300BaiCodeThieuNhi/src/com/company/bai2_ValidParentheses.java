package com.company;

import java.util.Stack;

public class bai2_ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c: s.toCharArray()
             ) {
            if (c=='(' || c=='[' || c=='{') {
                stack.push(c);
            } else if (c==')' && !stack.isEmpty() && stack.peek()=='(') {
                stack.pop();
            } else if (c==']' && !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            } else if (c=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            } else {
                return false;
            }

        }
        return stack.isEmpty();
    }
        public static void main(String[] args) {
            String s1 = "()";
            String s2 = "[]";
            String s3 = "{}";
            String s4 = "(}";
            String s5 = "(){}[]";
            String s6 = "(){}[](}";
            System.out.println(isValid(s1));
            System.out.println(isValid(s2));
            System.out.println(isValid(s3));
            System.out.println(isValid(s4));
            System.out.println(isValid(s5));
            System.out.println(isValid(s6));

        }




}
