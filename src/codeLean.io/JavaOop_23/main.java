package codeLean.io.JavaOop_23;

public class main {
    public static void main(String[] args) {
        Student s = new Student(1001, "Trung", 24, "Ha noi", 5);
        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getAddress());
        System.out.println(s.getScore());
        s.setScore(-7);
        System.out.println(s.getScore());
        s.setScore(15);
        System.out.println(s.getScore());
    }
}
