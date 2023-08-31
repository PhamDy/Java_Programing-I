package Lab_02.Exercise_1;

public class Client {
    public static void main(String[] args) {
        Student A = new Student();
        Student B = new Student(1, "Nguyen Van A", true);

        B.printInfo();
        B.setName("Nguyen Van B");
        B.printInfo();

    }
}
