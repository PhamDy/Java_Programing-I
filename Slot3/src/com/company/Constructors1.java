package com.company;

public class Constructors1 {
    int x;
    public Constructors1() {
        x=5;
    }

    public static void main(String[] args) {
        Constructors1 myObj = new Constructors1();
        System.out.println(myObj.x);
    }
}
