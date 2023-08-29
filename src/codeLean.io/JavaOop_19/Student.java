package codeLean.io.JavaOop_19;

public class Student {
    private String name;
    private char gender;

    public Student() {
        this.name = "Unknown";
        this.gender = 'u';
    }

    public Student(String name) {
        this.name = name;
        gender = 'u';
    }

    public Student(char gender) {
        name = "Unknown";
        this.gender = gender;
    }

    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        if (this.gender=='m') {
            System.out.println("Gender: Male");
        } else if (this.gender=='f') {
            System.out.println("Gender: Female");
        } else {
            System.out.println("Gender: Unknown");
        }
    }
}
