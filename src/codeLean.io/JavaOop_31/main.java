package codeLean.io.JavaOop_31;

public class main {
    public static void main(String[] args) {
        Student s = new Student("Hai", 1999, 8.8);
        System.out.println("Name: " + s.getName());
        System.out.println("Date of birth: " + s.getDob());
        System.out.println("GPA: " + s.getGPA());
    }
}
