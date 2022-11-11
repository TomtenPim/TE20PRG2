package Pong;

public class Pong {
    Ball b;
    Paddle p1;
    Paddle p2;
    int width;
    int height;

    public Pong (int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void update () {
        b.move();
        checkCollision();

    }
    private void checkCollision () {
        if (b.getY() < 0 ||b.getY() > height){
            b.bounce();
        }
        if (b.getX() < p1.getX()){
            if(b.getY() < p1.getY() ||b.getY() > p1.getY()+ p1.gedWidth() ){
                b.bounce(p1);
            }
        }
        if (b.getX() > p2.getX()){
            if(b.getY() < p2.getY() ||b.getY() > p2.getY()+ p1.gedWidth() ){
                b.bounce(p2);
            }
        }
    }
}
