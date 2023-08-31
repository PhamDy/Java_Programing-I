package Exercise1_lab04;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*super.getArea() + 2*3.14*super.getRadius()*height;
    }

    @Override
    public String toString() {
        return super.toString() + ", height = " + height;
    }
}
