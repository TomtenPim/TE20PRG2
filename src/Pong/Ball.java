package Pong;

public class Ball {
    int x;
    int y;
    int vx;
    int vy;

    public Ball (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move () {x = x+vx;}
    public void bounce (Paddle p) {vx = vx*-1;}
    public void bounce () {vy = vy*-1;}
}
