package Lab_02.Exercise_1;

public class Student {
    private int id;
    private String name;
    private boolean gender;

    public Student() {
        this.id = 1;
        this.name = "noname";
        this.gender = true;
    }

    public Student(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return this.gender;
    }

    public void setGender(boolean value) {
        this.gender = value;
    }

    public void printInfo() {
        System.out.println("---------------------------------");
        System.out.println("| ID |         Name           | Male |");
        System.out.println("|" + this.id + " |           " + this.name + "           | " + this.gender + " |");
    }

}
