package codeLean.io.JavaOop_8;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
