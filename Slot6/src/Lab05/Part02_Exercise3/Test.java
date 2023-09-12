package Lab05.Part02_Exercise3;

public class Test {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(2,5,8,7,9);
        movableCircle.moveDown();
        movableCircle.moveLeft();

        System.out.println(movableCircle.toString());

    }
}
