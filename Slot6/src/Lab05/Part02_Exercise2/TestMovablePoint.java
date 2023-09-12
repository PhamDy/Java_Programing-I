package Lab05.Part02_Exercise2;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(6,-8);

        for (int i = 0; i < 10; i++) {
            movablePoint.moveUp();
            movablePoint.moveDown();
            movablePoint.moveLeft();
            movablePoint.moveRight();
        }

        System.out.println("x: " + movablePoint.getX());
        System.out.println("y: " + movablePoint.getY());
    }
}
