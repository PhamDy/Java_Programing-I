package com.company;

public class String1 {
    public static void main(String[] args) {

        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt1.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        String txt3 = "Pham Dac Dy";
        System.out.println(txt3.indexOf("dy"));

        String firstName = "Pham";
        String lastName = "Dy";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

    }
}
