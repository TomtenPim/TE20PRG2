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

    }
    private void checkCollision () {
        if (b.y < 0 ||b.y > height){
            b.bounce();
        }
        if (b.x < 0){
            if(b.y < p1.getY() ||b.y > p1.getY()+10 ){
                b.bounce(p1);
            }
        }
        if (b.x > width){
            if(b.y < p2.getY() ||b.y > p2.getY()+10 ){
                b.bounce(p2);
            }
        }
    }
}
