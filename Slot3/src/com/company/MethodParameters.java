package com.company;

public class MethodParameters {
    static void myMethod(String fname) {
        System.out.println(fname + " Dy");
    }

    public static void main(String[] args) {
        myMethod("Pham");
        myMethod("Nguyen");
        myMethod("Tran");
    }
}
