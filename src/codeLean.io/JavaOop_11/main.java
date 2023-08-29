package codeLean.io.JavaOop_11;

public class main {
    public static void main(String[] args) {
        Student[] s = new Student[3];

        for (int i = 0; i < 3; i++) {
            s[i] = new Student();
        }
        s[0].name = "Tuan";
        s[0].age = 24;
        s[1].name = "Cuong";
        s[1].age = 25;
        s[2].name = "Duc";
        s[2].age = 24;

        for (int i = 0; i < 3; i++) {
            s[i].display();
        }


    }




}
