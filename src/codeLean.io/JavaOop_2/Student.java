package codeLean.io.JavaOop_2;

import java.util.Scanner;

public class Student {
    String name;
    int age;

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
