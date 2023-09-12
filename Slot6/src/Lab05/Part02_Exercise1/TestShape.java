package Lab05.Part02_Exercise1;

public class TestShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Black", 5,6);
        System.out.println("Rectangle: ");
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());

        System.out.println("-------------------------");

        Shape triangle = new Triangle("Red", 10,5);
        System.out.println("Triangle: ");
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());

    }
}
