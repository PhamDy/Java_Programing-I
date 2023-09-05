package Lab_02.DoItYourself.Exercise_1;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,7);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());

        System.out.println("---------------------------------");

        rectangle.setWidth(12);
        rectangle.setHeight(15);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());

        System.out.println("---------------------------------");

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());



    }
}
