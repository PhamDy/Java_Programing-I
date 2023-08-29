package codeLean.io.JavaOop_31;

public class Student extends Person{
    private double GPA;

    public Student(String name, int dob, double GPA) {
        super(name, dob);
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
