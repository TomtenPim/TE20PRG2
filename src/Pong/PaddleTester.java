package Pong;

public class PaddleTester {
    public static void main(String[] args) {
        Paddle test = new Paddle (10,10);
        test.moveDown();
        test.moveDown();
        test.moveDown();
        test.moveUp();
        test.moveDown();
        test.moveUp();
        test.moveUp();
        test.moveUp();
        int x = test.getX();
        System.out.println(x);
        int y = test.getY();
        System.out.println(y);
        int w = test.gedWidth();
        System.out.println(w);
    }
}