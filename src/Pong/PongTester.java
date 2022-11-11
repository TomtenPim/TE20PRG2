package Pong;

public class PongTester {
    public static void main(String[] args) {
        Pong pongtest = new Pong(20,20);
        Ball b = new Ball(5,5);
        Paddle p = new Paddle(20,0);
        while(b.getX() < 0 || b.getX() < pongtest.width){
        pongtest.update();
        }
    }
}
