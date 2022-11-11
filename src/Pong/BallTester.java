package Pong;

public class BallTester {
    public static void main(String[] args) {
    Ball b = new Ball(10,10);
    Paddle p = new Paddle(10,10);
        b.move();
        b.move();
        b.move();
        b.bounce();
        b.move();
        b.move();
        b.move();
        b.move();
        b.bounce(p);
        b.move();
        b.move();
        b.move();
        b.move();
        b.move();
        b.move();
    }
}
