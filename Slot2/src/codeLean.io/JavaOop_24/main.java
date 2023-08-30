package codeLean.io.JavaOop_24;

public class main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Kien", "Hoang", 1000);
        System.out.println("Id: " + e.getId());
        System.out.println("Name: " + e.getFullName());
        System.out.println("Salary " + e.getSalary());
    }
}
