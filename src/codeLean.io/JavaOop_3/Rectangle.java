package codeLean.io.JavaOop_3;

import java.util.Scanner;

public class Rectangle {
    double length;
    double width;

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        this.length = sc.nextDouble();
        this.width = sc.nextDouble();
    }
     public double getArea() {
        return length*width;
     }

     public double getPerimeter() {
        return 2*(length+width);
     }

     public void display(){
         System.out.println("Area: " + getArea());
         System.out.println("Perimeter: " + getPerimeter());
     }
}
